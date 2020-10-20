<?php
session_start();
include_once('conexao.php');
if(!empty($_POST['estrela'])){
    $estrela = $_POST['estrela'];
    $critica = $_POST['critica'];
    
    $consulta_login ="SELECT login_id FROM coleta_tb_login WHERE login_nome = '{$_SESSION['user']}'";
    $consulta_user = "SELECT usuario_id FROM coleta_tb_dadousuario WHERE login_id = ({$consulta_login})";
    $consulta = "SELECT * FROM coleta_tb_solicitacao WHERE usuario_id = ({$consulta_user})";
    
    $exibir = mysqli_query($conn, $consulta_user); 
    //salvar no banco
    while ($exibicao = mysqli_fetch_array($exibir)){
        $result_feedback ="INSERT INTO coleta_tb_feedback VALUES (null,'$estrela', now(),'$critica', {$exibicao['usuario_id']},'Enviado','')";
    }
    
    $resultado_feedback = mysqli_query($conn, $result_feedback);
    
    if(mysqli_insert_id($conn)){
        $_SESSION['msg'] = "<div class = 'alert alert-success'>Avaliação cadastrada com sucesso!</div>";
    header("Location: feedback.php");
    }else{
        $_SESSION['msg'] = "<div class = 'alert alert-warning'>Ocorreu um erro.</div>";
    header("Location: feedback.php");
    }
}else{
    $_SESSION['msg'] = "<div class = 'alert alert-warning'>Selecione ao menos uma estrela.</div>";
    header("Location: feedback.php");
}
?>

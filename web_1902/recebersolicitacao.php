<?php
session_start();
include_once('conexao.php');
//Recebendo dados do Formulário
    
    $data = $_POST['data'];
    $descricao= $_POST['descricao'];
    $residuo= $_POST['residuo'];
    $quantidade =$_POST['quantidade'];

$consulta_login ="SELECT login_id FROM coleta_tb_login WHERE login_nome = '{$_SESSION['user']}'";
$consulta_user = "SELECT usuario_id FROM coleta_tb_dadousuario WHERE login_id = ({$consulta_login})";
$consulta = "SELECT * FROM coleta_tb_solicitacao WHERE usuario_id = ({$consulta_user})";

$exibir = mysqli_query($conn, $consulta_user); 
//$exibicao = mysqli_fetch_array($exibir);
$result_solicit = "";
echo $consulta_user;
while ($exibicao = mysqli_fetch_array($exibir)){
    $result_solicit = "INSERT INTO coleta_tb_solicitacao VALUES (null,'$data', '$descricao','Aberto','$residuo', 0, {$exibicao['usuario_id']})";

}

$resultado_solicitacao = mysqli_query($conn, $result_solicit);

if(mysqli_insert_id($conn)){
        $_SESSION['msg'] = "<div class = 'alert alert-success'>Solicitação enviada com sucesso!</div>";
    header("Location: solicitaAgendamento.php");
    }else{
        $_SESSION['msg'] = "<div class = 'alert alert-warning'>Ocorreu um erro.</div>";
    header("Location: solicitaAgendamento.php");
    }
?>
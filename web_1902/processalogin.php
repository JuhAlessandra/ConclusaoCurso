<?php
session_start();
require_once('conexao.php');

if(isset($_POST['logar']))
{
    if(empty($_POST['login_nome']) || empty($_POST['login_senha'])){
        header("location: solicitaAgendamento.php?Vazio = Digite todos os dados!");
        
        
        }else{
        $query = "SELECT * FROM coleta_tb_login WHERE login_nome='".$_POST['login_nome']."' && login_senha ='".$_POST['login_senha']."' ";
        $result = mysqli_query($conn,$query);
        
        if(mysqli_fetch_assoc($result)){
            $_SESSION['user'] = $_POST ['login_nome'];
            header("location: solicitaAgendamento.php");
        }else{
            header("location:login.php?Invalido= Usuário ou senha incorretos!");
        }

        }

}else{
    
    
}
?>
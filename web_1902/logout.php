<?php
session_start();
if(isset($_GET['Sair'])){
    session_destroy();
    header("location: index.php");
}
?>
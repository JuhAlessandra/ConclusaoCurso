<?php
session_start();
include_once('conexao.php');
include_once('cabecalhosol.php');

$consulta_login ="SELECT login_id FROM coleta_tb_login WHERE login_nome = '{$_SESSION['user']}'";
$consulta_user = "SELECT usuario_id FROM coleta_tb_dadousuario WHERE login_id = ({$consulta_login})";
$consulta = "SELECT * FROM coleta_tb_solicitacao WHERE usuario_id = ({$consulta_user})";
$exibir = mysqli_query($conn, $consulta); 
//$exibicao = mysqli_fetch_array($exibir);
?>
<html>
    <body>
    <div id ="interface" class=" container"> 
        <hgroup id="divisor">
    <h1>Consulta de Solicitações</h1>
    </hgroup>
      
        <div class="container">
     <table id="estats" class="table table-striped table-hover ">
        <thead>
         <tr>
        
            
            <th>Data</th>
             <th>Descrição</th>
            <th>Rastreamento</th>
            <th>Tipo de resíduo</th>
            
        </tr>
            </thead>
        <?php  while ($dado = $exibir->fetch_array()){ ?>
        <tbody>
        <tr>
            
            <td><?php echo $dado["solicitacao_data"]; ?></td>
            <td><?php echo $dado["solicitacao_descricao"]; ?></td>
            <td><?php echo $dado["solicitacao_rastreamento"]; ?></td>
            <td><?php echo $dado["solicitacao_tiporesiduo"]; ?></td>
            
        </tr>
        </tbody>
        <?php }
         ?>
        </table>
        </div>
        </div>  
    </body>
</html>
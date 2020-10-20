<?php
session_start();
include_once('conexao.php');
include_once('cabecalhosol.php');

?>
<html>
<body>
        <!-- CABEÇALHO -->   
    <div id="interface" class="container"> 
    <hgroup id="divisor">
    <h1>Agendamento da Solicitação</h1>
    </hgroup>
        <?php 
        if(isset ($_SESSION['msg'])){
            echo $_SESSION['msg'];
            unset($_SESSION['msg']);
        }
?>
 <form name="SolicitaAgendamento" action="recebersolicitacao.php" method="POST"> 

     <div class ="col-md-2">
                 <label class ="control-label">Data para coleta:</label>
                     <div class="input-group date">
    <input name ="data" required type="date" class="form-control">
                </div>
            </div>     
     <!--CAIXA DE TEXTO--> <div class="form-group col-sm-10">
    <label for="AreadeTexto">Breve descrição sobre o pedido:</label>
    <textarea name="descricao" class="form-control" id="AreadeTexto" rows="3" placeholder="Condomínio."></textarea>
                    </div><!--CAIXA DE TEXTO-->
     
     <!--CAIXA DE TEXTO--> <div class="form-group col-sm-10">
    <label for="AreadeTexto">Tipo de Resíduo:</label>
    <textarea name="residuo"  class="form-control" id="AreadeTexto" rows="3" placeholder="Exemplo: Plástico, metal, pilhas, baterias, vidro..." required></textarea>
                    </div><!--CAIXA DE TEXTO-->
     <button type="submit" class="btn btn-success">Processar</button>
     
                </form> 
            </div>
        </body>
</html>
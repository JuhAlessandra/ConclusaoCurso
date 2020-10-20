<?php
session_start();
include_once('conexao.php');
include_once('cabecalhosol.php'); ?>
<html>
    <head>
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    </head>
<body>
    <div id="interface" class="container">      
      <hgroup id = "divisor">
       <h1>Feedback</h1>
        </hgroup>
        <?php 
        if(isset ($_SESSION['msg'])){
            echo $_SESSION['msg'];
            unset($_SESSION['msg']);
        }
?> 
    <form method="post" action = "processaFb.php" enctype="multipart/form-data">
    <div class="estrelas">
        <label for="Estrelas"> Avalie o agendamento:</label>
        <input type ="radio" id = "vazio" name="estrela" value="" checked>
        
        <label for ="estrela_um"><i class ="fa"></i></label>
        <input type ="radio" id = "estrela_um" name="estrela" value="1">
        
        <label for ="estrela_dois"><i class ="fa"></i></label>
        <input type ="radio" id = "estrela_dois" name="estrela" value="2">
        
        <label for ="estrela_tres"><i class ="fa"></i></label>
        <input type ="radio" id = "estrela_tres" name="estrela" value="3">
        
        <label for ="estrela_quatro"><i class ="fa"></i></label>
        <input type ="radio" id = "estrela_quatro" name="estrela" value="4">
        
        <label for ="estrela_cinco"><i class ="fa"></i></label>
        <input type ="radio" id = "estrela_cinco" name="estrela" value="5">
        
        </div>
        <div class="form-group col-sm-10">
            <label for="AreadeTexto">Comente um pouco sobre sua experiência:</label>
            <textarea name="critica" class="form-control" id="AreadeTexto" rows="3"></textarea>
        </div>
        <div>
            <button type="submit" class="btn btn-success">Enviar</button>
            
        </div>
    </form>
    </div>
</body>
</html>
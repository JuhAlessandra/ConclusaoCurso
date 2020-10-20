<!DOCTYPE html 5>
<html lang = "pt-br">
<head>   
    <meta charset="UTF-8"/>
     <link rel="shortcut icon" href="./imagens/icons8-vaso-de-planta-30.png" type="image.png"/>
    <link rel= "stylesheet" href ="css/bootstrap.css" type = "text/css"/>
    <link rel="stylesheet" href="css/estilo.css"/>
    <link rel="stylesheet" href ="css/bootstrap-theme.min.css" type="text/css"/>
    <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
    <title>Eu Reciclo!</title>
        </head>
<body>
   <!-- FIRST DIV --><div> 
       <header id ="cabecalho">           
        <!-- NAVBAR MENU --><nav class="navbar navbar-expand-lg navbar-dark bg-success">
            <a class="navbar-brand" href="#"><img src ="./imagens/icons8-vaso-de-planta-30.png"/>Eu reciclo!</a>
          <button class="navbar-toggler" type="button" data-toggle= "collapse" data-target = "#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent" role="navigation"><!-- CONTEÚDO DA NAVBAR-->
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="SolicitaAgendamento.php">Agendamento<span class="sr-only">(current)</span></a>
      </li>
        <li class="nav-item">
            <a class="nav-link" href="ConsultarSolicitacao.php">Consultas</a>
            </li>       
    <li class="nav-item">
            <a class="nav-link" href="feedback.php">Feedback</a>
            </li>
        <li class="nav-item">
            <div id ="nomeExib" class="container" id = "alinhamento">
        <?php
        if(isset($_SESSION['user'])){
            echo '<a class ="nav-link" href ="#"> Bem vindo(a) ' . $_SESSION['user'] . '!</a>';
            ?>
        </div>
        </li>
            <li class="nav-item" id = "alinhamento">
            <?php echo '<a class ="nav-link" href ="logout.php?Sair">Sair</a>';
        }else{
            header("location:index.php");
        }
        ?> 
            </li>  
      </ul>
    </div><!-- CONTEÚDO DA NAVBAR-->
</nav> <!-- NAVBAR MENU -->
    </header>
    </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>
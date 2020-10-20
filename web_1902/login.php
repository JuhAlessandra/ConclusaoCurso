<?php
include_once('cabecalho.php');
?>
<!DOCTYPE html 5>
<html lang = "pt-br">
<body>
   <!-- primeira DIV --><div> 
       
       <div id="interface" class ="container">
       <hgroup id = "divisor">
       <h1>Login</h1>
       </hgroup>
           <?php
           if(@$_GET['Vazio'] == true){
               
               ?>
           <div class="alert alert-danger"> <?php echo $_GET['Vazio']?></div>
           <?php
           }
           ?>
            <?php
           if(@$_GET['Invalido'] == true){
               
               ?>
           <div class="alert alert-warning col-md-6" text-aling="center"> <?php echo $_GET['Invalido']?></div>
           <?php
           }
           ?>
           
           <form action="processalogin.php" method="post">
    <div class="form-group col-md-6">
     <label>Nome</label>
     <input type="text" name="login_nome" class="form-control"  placeholder="Nome completo" required>

    </div>
    <div class="form-group col-md-6">
          <label>Senha</label>
          <input type="password" name="login_senha" class="form-control"  placeholder="Senha" required>
    </div>
          <p>Se você ainda não é cadastrado clique para <a id="login" href="CadastropessoaFisica.php">Pessoa Física</a> ou <a id="login" href="CadastropessoaJuridica.php">Pessoa Jurídica</a>
           </p>
               
              <div>
    <button type="submit" name="logar" class="btn btn-success">Logar</button>
     <button type="reset" class="btn btn-success"><a href="index.php">Voltar à pagina inicial</a></button>
      </div>
               
               </form>
        </div> <!-- INTERFACE -->
  </div> <!-- primeira DIV -->
    
        </body>

</html>
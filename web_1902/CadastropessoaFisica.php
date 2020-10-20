<?php
session_start();
include_once('conexao.php');
include_once('cabecalho.php');

?>
<!DOCTYPE html 5>
<html>
<head>
    <script src="js/jquery.mask.min.js" type="text/javascript"></script>
    <script>
    $(document).ready(function(){
        $('#cpf').mask('000.000.000-00', {reverse: true});
        $('#telcel').mask('(00) 00000-0000');
        $('#cep').mask('00000-000');
    });
    </script>
    </head>
<body>
   <div>
      <div id="interface" class="container">      
      <hgroup id = "divisor">
       <h1>Cadastro Pessoa Física</h1>
        </hgroup>
<?php 
        if(isset ($_SESSION['msg'])){
            echo $_SESSION['msg'];
            unset($_SESSION['msg']);
        }
?>
       <form id ="cadastro" action="processafisica.php" method="POST" >           
           <div class="input-group col-md-6">
  <div class="input-group-prepend">
    <label class="input-group-text" for="inputGroupSelect01">Tipo de acesso</label>
  </div>
  <select  class="custom-select" name="coleta_tb_grupo" id="inputGroupSelect01">
    <option selected>Selecione seu tipo de acesso</option>
       <?php
               $sql="SELECT * from coleta_tb_grupo";
               $res=mysqli_query($conn, $sql);
               while($vresult=mysqli_fetch_array($res)){
                  $grupo_id=$vresult['grupo_id'];
                  $grupo_descricao=$vresult['grupo_descricao'];
                   echo "<option value=$grupo_id> $grupo_descricao</option>";
               }
           ?>
                    </select> 
                </div>
               <div class="form-row">
               <div class="form-group col-md-6">
    <label>Nome</label>
    <input type="text" name="nome" class="form-control"  placeholder="Nome completo" required>
               </div>
    <div class="form-group col-md-6">
        <label>Telefone Celular</label>
        <input type="text" name="telefonecelular" id="telcel" class="form-control" maxlength="15"  placeholder="(00) 00000-0000"/>
    </div>               
    <div class="form-group col-md-6">
      <label>Email</label>
      <input type="email" name="emailparticular" class="form-control"  placeholder="Email">
    </div>
    <div class="form-group col-md-6">
     <label>Nome de Login</label>
     <input type="text" name="loginnome" class="form-control"  placeholder="Nome para login" required>
    </div>
    <div class="form-group col-md-6">
        <label>Senha</label>
        <input type="password" name="loginsenha"  class="form-control"  placeholder="Senha" required>
    </div>
    <div class="form-group col-md-6">
        <label >Endereço Residencial</label>
        <input type="text" class="form-control" name="logradouro" placeholder="Nome da rua">
    </div>
    <div class="form-group col-md-3">
        <label >Número</label>
        <input type="text" class="form-control" maxlength="12" name="numero" placeholder="000">
    </div>
    <div class="form-group col-md-3">
        <label >Bairro</label>
        <input type="text" class="form-control" name="bairro" placeholder="Bairro" required>
    </div>
    <div class="form-group col-md-6">
        <label >Cidade</label>
        <input type="text" name="municipio" class="form-control"  placeholder="Cidade">
    </div>
    <div class="form-group col-md-6">
        <label >Complemento</label>
        <input type="text" name="complemento" class="form-control"  placeholder="Complemento">
    </div>
    <div class="form-group col-md-6">
        <label >Referência</label>
        <input type="text" name="referencia" class="form-control"  placeholder="Referência">
    </div>
    <div class="form-group col-md-3">
        <label >Estado</label>
        <input type="text" name="uf" class="form-control"  placeholder="Estado">
    </div>
    <div class="form-group col-md-3">
        <label for="inputZip">CEP</label>
        <input type="text" id ="cep" name="cep" class="form-control" placeholder="00000-000" >
    </div>
</div>      
    <div>  
        <button type="submit" class="btn btn-success">Cadastrar</button>
        <button type="reset" class="btn btn-success"><a href="index.php">Voltar à página inicial</a></button>
    </div>  
       
</form>
        
    </div>
 </div>
 </body>
</html>
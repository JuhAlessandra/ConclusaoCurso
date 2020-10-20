<?php
session_start();
include_once("conexao.php");


        $razaosocial = $_POST['razaosocial'];
        $nomefantasia = $_POST['nomefantasia'];
        $telefoneempresarial = $_POST['telefoneempresarial'];
        $telefonecelular = $_POST['telefonecelular'];
        $emailparticular = $_POST['emailparticular'];
        $loginnome = $_POST['loginnome'];
        $loginsenha = $_POST['loginsenha'];
        $loginsenha = $loginsenha;
        $logradouro = $_POST['logradouro'];
        $numero = $_POST['numero'];
        $bairro = $_POST['bairro'];
        $complemento = $_POST['complemento'];
        $referencia = $_POST['referencia'];
        $municipio = $_POST['municipio'];
        $uf = $_POST['uf'];
        $cep = $_POST['cep'];
        $coleta_tb_grupo = $_POST['coleta_tb_grupo'];

       

//echo "razaosocial: $razaosocial <br>";

$sqlinsert5 = "INSERT INTO coleta_tb_login (login_nome, login_senha) VALUES ('$loginnome','$loginsenha')";
$exibe_login = mysqli_query($conn, $sqlinsert5) ;

$idlogin= "";
$consulta= "SELECT MAX(login_id) FROM coleta_tb_login";
$exibir=mysqli_query($conn, $consulta);
$exibicao = mysqli_fetch_array ($exibir);
$idlogin = $exibicao["MAX(login_id)"];



$insere_usuario ="
INSERT INTO coleta_tb_dadousuario 
(usuario_nome, 
usuario_nomefantasia, 
usuario_razaosocial, 
usuario_inscricaoestadual, 
usuario_inscricaomunicipal, 
usuario_representanteempresa, 
usuario_tipopessoa, 
usuario_cpf, 
usuario_cnpj, 
usuario_datacadastro, 
usuario_status,
login_id, 
grupo_id ) 
VALUES 
('','$nomefantasia','$razaosocial',' ',' ',' ',' ',0 , ' ',now(),'Ativo', $idlogin , $coleta_tb_grupo)";
$exibe_usuario = mysqli_query($conn, $insere_usuario);



$consulta= "SELECT MAX(usuario_id) AS ULTIMO FROM coleta_tb_dadousuario";
$exibir=mysqli_query($conn, $consulta);
 while ($dado = $exibir->fetch_array()){
    $idlogin = $dado["ULTIMO"];
}


$result_usuario = "INSERT INTO coleta_tb_endereco (usuario_id, endereco_cep, endereco_logradouro, endereco_numero, endereco_complemento, endereco_municipio, endereco_uf, endereco_referencia, endereco_bairro) VALUES ($idlogin, '$cep','$logradouro', $numero, '$complemento','$municipio', '$uf', '$referencia','$bairro')";
$resultado_usuario = mysqli_query($conn, $result_usuario);

 
$result_email = "INSERT INTO coleta_tb_email (email_empresarial, email_particular, usuario_id) VALUES (' ','$emailparticular',$idlogin)";
$salvar = mysqli_query($conn, $result_email);


$sqlinsert4 = "INSERT INTO coleta_tb_telefone (telefone_celular, telefone_fixo, telefone_comercial, telefone_empresarial, usuario_id) VALUES ('$telefonecelular', ' ', 0 , '$telefoneempresarial',$idlogin)";
$exibe_tele = mysqli_query($conn, $sqlinsert4) ;

if(mysqli_insert_id($conn)){
        $_SESSION['msg'] = "<div class = 'alert alert-success'>Cadastro efetuado com sucesso!</div>";
    header("Location: CadastropessoaJuridica.php");
    }else{
        $_SESSION['msg'] = "<div class = 'alert alert-warning'>Ocorreu um erro.</div>";
    header("Location: CadastropessoaJuridica.php");
    }

?>

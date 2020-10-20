<?php
include_once('cabecalho.php');
?>
<!DOCTYPE html 5>
<html lang = "pt-br">
<body>
   <!-- FIRST DIV --><div>    
    <div id="interface" class ="container">
       <hgroup id = "divisor">
       <h1>Ecoponto</h1>
       </hgroup>
        <p class="container col-md-auto"> Aqui nesta página irá encontrar pontos linkados no mapa de cooperativas, sendo mais prática a visualização do endereço</p>
        
        <div class="mapouter"><div class="gmap_canvas">
            <iframe width="1100" height="500" id="gmap_canvas" src="https://maps.google.com/maps?q=reciclagem%20atibaia&t=&z=13&ie=UTF8&iwloc=&output=embed" frameborder="0" scrolling="no" marginheight="0" marginwidth="0">
            </iframe><a href="https://www.pureblack.de/google-maps/">pureblack.de</a>
            </div>
            <style>.mapouter{text-align:right;height:500px;width:1100px;}.gmap_canvas {overflow:hidden;background:none!important;height:500px;width:1100px;}
                </style>
            </div>
        </div> <!-- INTERFACE -->
   </div> <!-- FIRST DIV -->
    </body>
</html>
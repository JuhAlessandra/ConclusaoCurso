<?php
include_once('conexao.php');
include_once('cabecalho.php');
$estatistica = "SELECT * FROM coleta_tb_estatistica";
$usuario_a = "SELECT usuario_id FROM coleta_tb_endereco where endereco_municipio = Atibaia";
$usuario_b = "SELECT usuario_id FROM coleta_tb_endereco where endereco_municipio = Bragança Paulista";

$exibir1 = mysqli_query($conn, $estatistica);
//$exibicao1 = mysqli_fetch_array($exibir1);
?>
<!DOCTYPE html 5>
<html lang = "pt-br">
<body>
   <!-- FIRST DIV --><div>
    <div id="interface" class="container" >
       <hgroup id = "divisor">
       <h1>Estatísticas</h1>
       </hgroup>
        <p class="container col-md-auto">Aqui estão as estatísticas que você poderá consultar com base mensal dos usuários do aplicativo</p>
            <!-- TABELA --><div class="container" align ="center"> 
           <table id="estats" class="table table-striped table-hover container">
           <thead>
           <tr>
               <th>Descrição do produto</th>
               <th>Quantidade</th>
               <th>Data da recolha</th>
               </tr>    
               </thead>
               <?php while ($dado1 = $exibir1->fetch_array()){ ?>
               <tbody>
                   <tr>
                   <td><?php echo $dado1 ["estatistica_tiporesiduo"] ?></td>
                   <td><?php echo $dado1 ["estatistica_quantidaderesiduo"] ?></td>
                   <td><?php echo $dado1 ["estatistica_datarecolha"] ?></td>
                   </tr>
               </tbody>
               <?php } 
               ?>
                    </table>
       
            </div> <!-- TABELA -->
<!-- GRÁFICO -->
        <!-- Styles -->
<!--
<style>
#chartdiv {
  width: 100%;
  height: 600px;
  font-size: 12px;
}

.amcharts-pie-slice {
  transform: scale(1);
  transform-origin: 50% 50%;
  transition-duration: 0.3s;
  transition: all .3s ease-out;
  -webkit-transition: all .3s ease-out;
  -moz-transition: all .3s ease-out;
  -o-transition: all .3s ease-out;
  cursor: pointer;
  box-shadow: 0 0 30px 0 #000;
}

.amcharts-pie-slice:hover {
  transform: scale(1.1);
  filter: url(#shadow);
}							
</style>
-->

<!-- Resources -->
<!--
<script src="https://www.amcharts.com/lib/3/amcharts.js"></script>
<script src="https://www.amcharts.com/lib/3/pie.js"></script>
<script src="https://www.amcharts.com/lib/3/plugins/export/export.min.js"></script>
<link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
<script src="https://www.amcharts.com/lib/3/themes/none.js"></script>
-->

<!-- Chart code -->
<script>
//var chart = AmCharts.makeChart("chartdiv", {
//  "type": "pie",
//  "startDuration": 0,
//   "theme": "none",
//  "addClassNames": true,
//  "legend":{
//   	"position":"right",
//    "marginRight":100,
//    "autoMargins":false
//  },
//  "innerRadius": "30%",
//  "defs": {
//    "filter": [{
//      "id": "shadow",
//      "width": "200%",
//      "height": "200%",
//      "feOffset": {
//        "result": "offOut",
//        "in": "SourceAlpha",
//        "dx": 0,
//        "dy": 0
//      },
//      "feGaussianBlur": {
//        "result": "blurOut",
//        "in": "offOut",
//        "stdDeviation": 5
//      },
//      "feBlend": {
//        "in": "SourceGraphic",
//        "in2": "blurOut",
//        "mode": "normal"
//      }
//    }]
//  },
//  "dataProvider": [{
//    "country": "Atibaia",
//    "litres": 501.9
//  }, {
//    "country": "Bragança Paulista",
//    "litres": 301.9
//  }, {
//    "country": "Nazaré Paulista ",
//    "litres": 201.1
//  },          ],
//  "valueField": "litres",
//  "titleField": "country",
////  "export": {
////    "enabled": true
////  }
//});
//
//chart.addListener("init", handleInit);
//
//chart.addListener("rollOverSlice", function(e) {
//  handleRollOver(e);
//});
//
//function handleInit(){
//  chart.legend.addListener("rollOverItem", handleRollOver);
//}
//
//function handleRollOver(e){
//  var wedge = e.dataItem.wedge.node;
////  wedge.parentNode.appendChild(wedge);
//}
</script>

<!-- HTML -->
<div id="chartdiv" class="container"></div>
<!-- GRÁFICO -->
        </div> <!-- INTERFACE -->
    </div><!-- FIRST DIV -->
<footer>
    <a href="https://icons8.com">Icon pack by Icons8&copy;</a>
    </footer>
        </body>
</html>
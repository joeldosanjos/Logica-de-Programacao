<html>
<head>
	<title> Exercicio 3 PHP </title>
</head>
<body>
<?php
	ini_set('default_charset','UTF-8');
	$primeiro = $_POST['primeiro'];
	$segundo = $_POST['segundo'];
	$resultado = 0;
	
	$resultado = $primeiro + $segundo;
	$resultado = $resultado * $primeiro;
	
	echo "O resultado final é $resultado";
?>
</body>
</html>
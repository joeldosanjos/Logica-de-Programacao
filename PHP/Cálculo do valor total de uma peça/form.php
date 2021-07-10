<?php
	ini_set('default_charset','UTF-8');
	$codigo = $_POST['codigo'];
	$valor = $_POST['valor'];
	$qtde = $_POST['qtde'];
	$valortotal = 0;
	
	$valortotal = $valor * $qtde;
	
	echo "O código do seu produto é: $codigo,
	e o valor total do seu produto é: $valortotal";
?>
<?php
	ini_set('default_charset','UTF-8');
	$qtdmin = $_POST['qtdmin'];
	$qtdmax = $_POST['qtdmax'];
	$estoquemedio = 0;

	$estoquemedio = (($qtdmin + $qtdmax)/2);
	echo "O estoque médio é $estoquemedio";
?>

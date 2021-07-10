<?php
	ini_set('default_charset','UTF-8');

	$primeiro = $_POST['primeiro'];
	$segundo = $_POST['segundo'];

	$resultado = $primeiro + $segundo;

	echo "O resultado é $resultado."
?>
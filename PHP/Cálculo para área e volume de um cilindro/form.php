<?php
	ini_set('default_charset',"UTF-8");
	$raio = $_POST['raio'];
	$altura = $_POST['altura'];
	$area = 0;
	$volume = 0;

	$area = (3.14 * $raio * $raio);
	$volume = (3.14 * $raio * $raio * $altura);

	echo "A área é $area e o volume é $volume";
?>
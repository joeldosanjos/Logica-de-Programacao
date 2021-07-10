<?php
	ini_set('default_charset','UTF-8');

	$basequad= $_POST['basequad'];
	$basetri= $_POST['basetri'];
	$baseret= $_POST['baseret'];
	$alturaquad= $_POST['alturaquad'];
	$alturatri= $_POST['alturatri'];
	$alturaret= $_POST['alturaret'];

	$resulquad = $basequad * $alturaquad;
	$resultri = (($basetri * $alturatri)/2);
	$resulret = $baseret * $alturaret;

	echo "A área do quadrado triângulo é $resultri, a do quadrado é $resulquad e a do retângulo é $resulret.";
?>
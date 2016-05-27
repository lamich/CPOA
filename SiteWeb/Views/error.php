<?php
	ob_start();
	$title='Erreur!';
	
	
	echo '<p class="erreur">'.$erreur.'</p>'; //Affichage erreur

	$content=ob_get_clean();
	include('layout.php');
?>
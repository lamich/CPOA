<?php
	ob_start();
	$title='Film';

	
	foreach($films as $data)
		{
		//Afichage des films
		
			echo '<div class="AfficheFilm"><a href="index.php?page=dfilm&dfilm='.$data['numVisa'].'"><img src="assets/images/'.$data['numVisa'].'" alt="'.$data['titre'].'" ></a></br><a class="titreFilm" href="index.php?page=film&film='.$data['numVisa'].'">'.$data['titre'].'</a></div>';
		
		}
	
	$content=ob_get_clean();
	include('layout.php');
?>
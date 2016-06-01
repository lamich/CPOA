<?php
	ob_start();
	$title='Film';

	
	foreach($films as $data)
		{
		//Afichage des films
			if(file_exists('assets/images/'.$data['numVisa'].'.jpg')==TRUE)
			{
			echo '<div class="AfficheFilm"><a href="index.php?page=dfilm&dfilm='.$data['numVisa'].'"><img src="assets/images/'.$data['numVisa'].'" alt="'.$data['titre'].'" ></a></div>';
			}
			else
			{
			echo '<div class="AfficheFilm"><a href="index.php?page=dfilm&dfilm='.$data['numVisa'].'"><img src="assets/images/default.jpg" alt="Affiche par default" ></a></div>';
			}
		}
	
	$content=ob_get_clean();
	include('layout.php');
?>
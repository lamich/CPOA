<?php

include('Model/Model.php'); 
include('Model/FilmManager.php');


	if($_GET['page']=='film')
	{
		$fm = new FilmManager();
		$films=$fm->getFilm();
		include('Views/film.php');
	}
	else
	{
		include('Views/accueil.php');
	}


?>
<?php

include('Model/Model.php'); 
include('Model/FilmManager.php');


	if(isset($_GET['page']))
	{
		if($_GET['page']=='film')
		{
			$fm = new FilmManager();
			$films=$fm->getFilm();
			include('Views/film.php');
			
			
		}
		else
		{
			if($_GET['page']=='dfilm')
			{
				if(isset($_GET['dfilm']))
				{
					$fm = new FilmManager();
					$film=$fm->getDetailsFilm($_GET['dfilm']);
					
					$fm = new FilmManager();
					$rea=$fm->getRealisateur($_GET['dfilm']);
					
					$fm = new FilmManager();
					$act=$fm->getActeur($_GET['dfilm']);
					include('Views/detailsFilm.php');
				}
				else
				{
					$erreur="Pas de film précisé dans l'url";
					include('Views/error.php');
				}
			}
			else
			{
				$erreur="La page n'existe pas";
				include('Views/error.php');
			}
			
		}
	}
	else
	{
		include('Views/accueil.php');
	}	
?>
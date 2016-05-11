<?php
	class FilmManager extends Model {

		public function getFilm() {

			
				$req='SELECT * FROM FILM';
				$resultat = $this->executerRequete($req);
				$tabresult = $resultat -> fetchAll();
				
			
				
			
		return $tabresult;
		
		}
		
		
	}
?>
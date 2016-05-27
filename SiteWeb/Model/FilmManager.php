<?php
	class FilmManager extends Model {

		public function getFilm() {

			
				$req='SELECT * FROM FILM';
				$resultat = $this->executerRequete($req);
				$tabresult = $resultat -> fetchAll();
				
			
				
			
		return $tabresult;
		
		}
		
		public function getDetailsFilm($numVisa) {

			
				$req='SELECT * FROM FILM WHERE numVisa=?';
				$resultat = $this->executerRequete($req,array($numVisa));
				$tabresult = $resultat -> fetch();

		return $tabresult;
		
		}
		
		public function getRealisateur($numVisa) {
			
				$req='SELECT * FROM VIP,REALISE WHERE numVisa=? AND VIP.numVip=REALISE.numVip';
				$resultat = $this->executerRequete($req,array($numVisa));
				$tabresult = $resultat -> fetch();

		return $tabresult;
		
		}
		
		public function getActeur($numVisa) {
			
				$req='SELECT * FROM VIP,CASTING WHERE numVisa=? AND VIP.numVip=CASTING.numVip';
				$resultat = $this->executerRequete($req,array($numVisa));
				$tabresult = $resultat -> fetchAll();

		return $tabresult;
		
		}
		
	}
?>
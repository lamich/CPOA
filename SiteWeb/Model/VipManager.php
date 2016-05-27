<?php
	class VipManager extends Model {

		public function getVip() {

			
				$req='SELECT * FROM VIP';
				$resultat = $this->executerRequete($req);
				$tabresult = $resultat -> fetchAll();

		return $tabresult;
		
		}
		
		public function getDetailsVip($num) {

			
				$req='SELECT * FROM VIP WHERE numVip=?';
				$resultat = $this->executerRequete($req,array($num));
				$tabresult = $resultat -> fetch();

		return $tabresult;
		
		}
		
		public function getRealisateur($num) {

			
				$req='SELECT * FROM VIP,REALISE WHERE numVip=? AND VIP.numVip=REALISE.numVip';
				$resultat = $this->executerRequete($req,array($num));
				$tabresult = $resultat -> fetch();

		return $tabresult;
		
		}
		
		
	}
?>
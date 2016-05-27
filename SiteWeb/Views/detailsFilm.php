<?php
	ob_start();
	$title='Film';
?>
<h2>Détails du film <?php echo $film['titre'] ?> </h2>

<table>
   <tr>
       <td rowspan="2">
	   <?php
	   //Afichage de l'image
		echo '<img src="assets/images/'.$film['numVisa'].'" alt="'.$film['titre'].'" class="detailsAffiche">';
		
		?>
	</td>
       <td>Réalisateur:</td>
       <td>
		<?php echo '<p>'.$rea['prenomVip'].' '.$rea['nomVip'].'</p>' //Affichage de la categorie?>
	   </td>
   </tr>
   <tr>
       
       <td>Acteur(s):</td>
       <td>
	   <?php
	   foreach($act as $data)
		{
	    echo '<p>'.$data['prenomVip'].' '.$data['nomVip'].'</p>'; //Affichage de la categorie
		}
		?>
	   </td>
   </tr>
</table>
	
<?php
	$content=ob_get_clean();
	include('layout.php');
?>
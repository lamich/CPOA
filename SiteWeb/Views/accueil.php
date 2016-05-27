<?php
	ob_start();
	$title='Voicela';
?>
	<p>
	<h2>Bienvenue sur le site Voicela.</h2></br>
	Vous retrouverez sur ce site toutes les informations concernant les stars.
	</p>
<?php
	$content=ob_get_clean();
	include('layout.php');
?>
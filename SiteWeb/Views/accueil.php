<?php
	ob_start();
	$title='Voicela';
?>
	<p><h2>Bienvenue sur le site Voicela.</h2></br>Ici vous pouvez vous tenir aux courants de la vie des stars. =))))))))))))))))))</p>
<?php
	$content=ob_get_clean();
	include('layout.php');
?>
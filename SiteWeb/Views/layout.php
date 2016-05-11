<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title><?php echo $title ?></title>
	<link rel="stylesheet" href="assets/CSS/styles.css">
</head>
<body>
	
	<header>
		<h1>VOICELA</h1>
		<ul id="navigation">
			<li><a href="index.php">Accueil</a></li>
			<li><a href="index.php?page=film">Film</a></li>
			<li><a href="index.php?page=vip">Vip</a></li>
			
			
		</ul>
	</header>
	<section>
		<?php echo $content ?>
	</section>
<footer>
	<p>Site créé exclusivement en PHP,HTML5 et CSS.</p>
</footer>

</body>
</html>
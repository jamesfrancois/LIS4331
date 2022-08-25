<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="My online portfolio that illustrates skills acquired while working through various project requirements.">
		<meta name="author" content="James S. François">
    <link rel="icon" href="favicon.ico">

		<title>LIS4381 Assignment 3</title>		
		<?php include_once("../css/include_css.php"); ?>			
  </head>

  <body>

		<?php include_once("../global/nav.php"); ?>
		
		<div class="container">
			<div class="starter-template">
				<div class="page-header">
					<?php include_once("global/header.php"); ?>	
				</div>
				<p class="text-justify">
				Description: Frequently, not only will you be asked to design and develop Web applications, but you will also be asked 
				to create (design) database solutions that interact with the Web application and, in fact, the data 
				repository is the *core* of all Web applications. Hence, the following business requirements. 
 
				A pet store owner, who owns a number of pet stores, requests that you develop a Web application 
				whereby he and his team can record, track, and maintain relevant company data, based upon the 
				following business rules: 
 
				1. A customer can buy many pets, but each pet, if purchased, is purchased by only one customer. 
				2. A store has many pets, but each pet is sold by only one store. 	
			</p>

				<h4>ERD</h4>
				<img src="img/Erd.png" class="img-responsive center-block" alt="JDK Installation">

				<h4>Running applications opening user interface</h4>
				<img src="img/First.png" class="img-responsive center-block" alt="Android Studio Installation">

				<h4>Running applications processing user input</h4>
				<img src="img/Second.png" class="img-responsive center-block" alt="Android Studio Installation">

				<h4>Record of each table</h4>
				<img src="img/Datatables.png" class="img-responsive center-block" alt="Android Studio Installation">
				
				<h4>skillset 4</h4>
				<img src="img/Skillset4.png" class="img-responsive center-block" alt="AMPPS Installation">

				<h4>skillset 5</h4>
				<img src="img/Skillset5.png" class="img-responsive center-block" alt="AMPPS Installation">

				<h4>skillset 6</h4>
				<img src="img/Skillset6.png" class="img-responsive center-block" alt="AMPPS Installation">
				
				<?php include_once "global/footer.php"; ?>

			</div> <!-- starter-template -->
    </div> <!-- end container -->

		<!-- Bootstrap JavaScript
				 ================================================== -->
		<!-- Placed at end of document so pages load faster -->		
		<?php include_once("../js/include_js.php"); ?>			
  </body>
</html>

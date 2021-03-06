
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object hotels extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

  <head>
	  <meta charset="utf-8">
	  <link rel="stylesheet" href="/assets/stylesheets/font-awesome.min.css">
	  <link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
	     
	  <link rel="stylesheet" href="/assets/stylesheets/style.css" type="text/css" media="screen">
  </head>

  <body>

	<script src="/assets/javascripts/script.js"></script>
	<script src="/assets/javascripts/jquery.min.js"></script>
	<script src="/assets/bootstrap/js/bootstrap.min.js"></script> 
	<script src="/assets/javascripts/jquery-1.10.1.min.js"></script>
		
		<header>
		  <div class="banner">
		   <a href="/"><img src="/assets/images/banner4.jpg" alt="Banner"></a>	
		  </div>
		</header>

    <nav class="navbar navbar-static-top">
	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>

      <ul class="nav navbar-nav">
		<li><a href="/index">Home</a></li>
        <li class="active"><a href="/Hotels">Hotels</a></li>
        <li><a href="/flight">Flights</a></li>
        <li><a href="/essential">Essentials</a></li>
      </ul>

      
        <ul class="nav navbar-nav">
		
          
            <li>
			<a class="dropdown-hover" data-toggle="dropdown">Destinations<span class="caret"></span></a>
                
				<ul id="dropdown" class="dropdown-menu">
				
                  <li class="dropdown-header">Africa</li>
                  <li><a href="/africa#Egypt">Egypt</a></li>
                  <li><a href="/africa#Kenya">Kenya</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">America</li>
                  <li><a href="/america#NewYork">New York City</a></li>
                  <li><a href="/america#LasVegas">Las Vegas</a></li>
                  <li><a href="/america#Canada">Canada</a></li>
                  <li><a href="/america#Brazil">Brazil</a></li>
                  <li><a href="/america#Argentina">Argentina</a></li>
                
				

                
                  <li class="dropdown-header">Asia</li>
                  <li><a href="/asia#Thailand">Thailand</a></li>
                  <li><a href="/asia#Japan">Japan</a></li>
                  <li><a href="/asia#UAE">United Arab Emirates</a></li>
                  <li class="divider"></li>
                  <li class="dropdown-header">Australia</li>
                  <li><a href="/australia#Australia">Australia</a></li>
                  <li><a href="/australia#NewZealand">New Zealand</a></li>
                  <li><a href="/australia#Fiji">Fiji</a></li>
                
			 
                
                  <li class="dropdown-header">Europe</li>
                  <li><a href="/europe#Ireland">Ireland</a></li>
                  <li><a href="/europe#France">France</a></li>
                  <li><a href="/europe#UK">United Kingdom</a></li>
                  <li><a href="/europe#Spain">Spain</a></li>
                  <li><a href="/europe#Poland">Poland</a></li>
				  
                </ul>
              
            
			</li>
		  
        </ul>

      <!-- /.nav-collapse -->

      <ul class="nav navbar-nav">
        <li><a href="/deals">Deals</a></li>
        
      </ul>

      <ul class="nav navbar-nav navbar-right">
        <li><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>

			<form class="navbar-form navbar-left">
			  <div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			  </div>
			  <button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
			</form>

      </ul>
    </nav>
			<div class="clear">
			</div>
					
	<main>
		<!--fix style sheet to align the pictures and text and make the pictures href to page that allows fill in the booking form-->
		<div id="hotels" class="row">
		<div class="headingHotel">
		<h2>Spain</h2>
		</div>
		<div class="col-sm-6 col-md-2">
		<a href="/booking" ><img src="/assets/images/losPelicanosOcas.jpg" alt="losPelicanosOcas" width="300" height="300" align="left" ></a>
		</div>
		<div class="col-sm-6 col-md-2">
		<h3>Los Pelicanos Ocas ***</h3>
		<p>>	Only 300 m from Levante Beach</p>
		<p>>	5 pools: 1 lagoon-style (with 3 whirlpools and 3 geysers), 2 children’s pools, 1 outdoor pool for activities and 1 for adults</p>
		<p>>	Fabulous evening shows inspired by Broadway musicals, parties in the lagoon-style pool, children's funny play area</p>
		<p>>	Wi-Fi access throughout the hotel</p>
		<p>>	Fantastic international theme buffets and areas serving local specialities</p>
		</div>
		
		<div class="col-sm-6 col-md-2">
		<a href="/booking"><img src="/assets/images/eurostarsToledo.jpg" alt="eurostarsToledo" width="300" height="300" align="left"></a>
		</div>
		<div class="col-sm-6 col-md-2">
		<h3>Eurostars Toledo ****</h3>
		<p>>	Excellent paranomic views of the old town</p>
		<p>>	Business Center</p>
		<p>>	Wi-Fi Internet Connection</p>
		<p>>	Outdoor Pools</p>
		</div>
		</div>
		
		<div id="hotels" class="row">
		<div class="headingHotel">
		<h2>France</h2>
		</div>
		<div class="col-sm-6 col-md-2 col-xs-6">
		<a href="/booking"><img src="/assets/images/monteCarlo.jpg" alt="FairmontMonteCarlo" width="300" height="300" align="left"></a>
		</div>
		<div class="col-sm-6 col-md-2 col-xs-6">
		<h3>Fairmont Monte Carlo</h3>
		<p>>	Stunning views of the Mediterranean Sea</p>
		<p>>	Luxurious accommodations and gracious service</p>
		<p>>	Wi-Fi Internet Connection</p>
		</div>
		
		<div class="col-sm-6 col-md-2 col-xs-6">
		<a href="/booking"><img src=".jpg" alt="" width="300" height="300" align="left"></a>
		</div>
		<div class="col-sm-6 col-md-2 col-xs-6">
		</div>
		</div>
		
	</main>
	
			<div class="clear">
			</div>

	<footer>
	
		<div class="container">
		  <h2>Contact Us</h2>
		  <p>Feel free to contact  us by filling the contact form or visiting our social network sites like Facebook, Youtube, Twitter.</p>
		  
		  <form class="form-horizontal">
			<div class="form-group">
			  <label for="name">Name:</label>
			  <input type="name" class="form-control" id="name" placeholder="Enter your full name">
			</div>
			<div class="form-group">
			  <label for="email">Email address:</label>
			  <input type="email" class="form-control" id="email" placeholder="Enter email">
			</div>
			<div class="form-group">
			  <label for="message">Message:</label>

			  <textarea  class="form-control" placeholder="Enter message"></textarea>
			</div>
			<div class="text-right">
			<button type="submit" class="btn btn-default">Send</button>
			</div>
		  </form>
		  
		 <hr>
              <h4>Our Social Sites</h4>
				<a href="https://www.facebook.com/" class="fa fa-facebook"></a>
				<a href="https://twitter.com/" class="fa fa-twitter"></a>
				<a href="https://plus.google.com/" class="fa fa-google"></a>
				<a href="https://www.youtube.com/" class="fa fa-youtube"></a>
				
				<hr>
				<h4>Our Address</h4>
				<p>Tallaght Dublin 24, Ireland</p>
				<h4>Phone</h4>
				<p>(01) 123 436</p>
				<h4>Email</h4>
				<p>sunshinetravel@gmail.com</p>
		<<hr>
			<div class="payment">
			<img src="/assets/images/payment.jpg" alt="Payment" width="470" height="30" align="middle">
			</div>
		
		</div>
	<div class="copyright">
	<span>&copy; 2017 Sunshine Travel. All Rights Reserved.</span></div>
	</footer>

  </body>

</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 24 01:51:44 GMT 2017
                  SOURCE: C:/Users/brand/Downloads/WebCA2/app/views/hotels.scala.html
                  HASH: 014bbca3576df09a9381dc0b8a7cbb468808de8f
                  MATRIX: 1031->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
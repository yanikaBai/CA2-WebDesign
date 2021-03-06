
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

object europe extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
		<li><a href="/">Home</a></li>
        <li><a href="/hotels">Hotels</a></li>
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
		<div class="europe">
			<section id="Ireland">
				<h3>Ireland</h3>
				<img src="/assets/images/ireland.jpg" alt="Ireland"/>
				<h5><b>Holiday in Ireland</b></h5>
				<p>Ireland is a country brimming with fun and fascinating ways to spend your days. 
				Discover just the right mountain to climb, painting to pore over, sports team to cheer on, 
				or whatever else takes your fancy. <br><br>
				From a jam-packed national concert calendar to breathtaking gallery exhibitions, world-class food and drink events, 
				cultural celebrations and superb marathons and races in some of the most scenic locations in the world, 
				there’s always something going on in Ireland. Discover the best of what’s on.</p>
			</section>
			
			<div class="clear">
			</div>
			
			<section id="France">
				<h3>France</h3>
				<img src="/assets/images/france2.jpg" alt="France"/>
				<h5><b>Holiday in France</b></h5>
				<p>France is the most popular sightseeing destination in the world. With over 82 million visitors in 2007, and as just about as many things to see and do,
				this beautiful and historic country is a must for every traveller and tourist. Its buildings can be treasures - such as the magnificent Notre-Dame, 
				stately Arc de Triomphe and the palace of Versailles - or containers of treasures, such as the unrivalled collections of the Louvre (home to Mona Lisa) 
				and Museé d'Orsay with its globally respected portfolio of Impressionist art.</p>
			</section>
			
			<div class="clear">
			</div>
			
			<section id="UK">
				<h3>United Kingdom</h3>
				<img src="/assets/images/uk.jpg" alt="UK"/>
				<h5><b>Holiday in United Kingdom</b></h5>
				<p>Step aboard the London Eye, Europe’s tallest observation wheel in the centre of London, and see the city’s world famous landmarks from above. 
				During your 30 minute ride you can even relax in the comfortable seats inside the capsule and take the whole of London in from this unique viewing point.<br><br>
				<b>The attraction</b>
				<li>One of London’s most recognisable landmarks, and the most popular ticketed tourist attraction in the city</li>
				<li>Spectacular 360° views of London, up to 40km on a clear day</li>
				<li>See Big Ben, St. Paul’s Cathedral, Tower Bridge, the Shard and much more</li></p>
				
			</section>
			
			<div class="clear">
			</div>
			
			<section id="Spain">
				<h3>Spain</h3>
				<img src="/assets/images/spain2.jpg" alt="Spain"/>
				<h5><b>Holiday in Spain</b></h5>
				<p>If you’re visiting Spain for the first time, be warned: this is a country that fast becomes an addiction. You might intend to come just for a beach holiday, 
				a walking tour or a city break, but before you know it you’ll find yourself hooked by something quite different – 
				the wild celebration of some local fiesta, perhaps, or the otherworldly architecture of Barcelona. Even in the best-known places to visit – 
				from the capital, Madrid, to the costas, from the high Pyrenees to the Moorish cities of the south – there are genuinely surprising attractions at every turn, 
				whether it’s hip restaurants in the Basque country, the wild landscapes of the central plains, or cutting-edge galleries in the industrial north.</p>
			</section>
			
			<div class="clear">
			</div>
			
			<section id="Poland">
				<h3>Poland</h3>
				<img src="/assets/images/poland.jpg" alt="Poland"/>
				<h5><b>Holiay in Poland</b></h5>
				<p>Poland’s roots go back to the turn of the first millennium, leaving a thousand years of twists and turns and kings and castles to explore. 
				WWII history buffs are well served. Tragically, Poland found itself in the middle of that epic fight, and monuments and museums dedicated to its battles – 
				and to Poland’s remarkable survival – can be seen everywhere. There’s a growing appreciation, too, of the rich Jewish heritage. Beyond the deeply affecting Holocaust memorials, 
				synagogues are being sensitively restored, and former Jewish centres such as Łódź and Lublin have heritage trails, so you can trace this history at your own pace.</p>
			</section>
			
			<div class="clear">
			</div>
			
		</div>
	
		
	</main>
	
			<div class="clear">
			</div>

	<footer>
	
		<div class="container">
		  <h3>Contact Us</h3>
		  <p>Feel free to contact us by filling the contact form or visiting our social network sites like Facebook, Youtube, Twitter.</p>
		  
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
		<hr>
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
                  SOURCE: C:/Users/brand/Downloads/WebCA2/app/views/europe.scala.html
                  HASH: 28f6331fd0fedf794c647341e964c33f888df5b6
                  MATRIX: 1031->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
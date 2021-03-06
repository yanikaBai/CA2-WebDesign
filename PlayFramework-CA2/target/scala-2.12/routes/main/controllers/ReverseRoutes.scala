
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Downloads/WebCA2/conf/routes
// @DATE:Sun Dec 24 02:14:26 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def hotels(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hotels")
    }
  
    // @LINE:23
    def addFlightSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addFlightSubmit")
    }
  
    // @LINE:7
    def america(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "america")
    }
  
    // @LINE:8
    def asia(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "asia")
    }
  
    // @LINE:13
    def europe(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "europe")
    }
  
    // @LINE:17
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:12
    def essential(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "essential")
    }
  
    // @LINE:9
    def australia(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "australia")
    }
  
    // @LINE:20
    def addFlight(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addflight")
    }
  
    // @LINE:10
    def booking(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "booking")
    }
  
    // @LINE:14
    def flight(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "flight")
    }
  
    // @LINE:11
    def deals(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deals")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:26
    def deleteFlight(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delFlight/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:16
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:33
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Logout")
    }
  
    // @LINE:16
    def login(): Call = {
    
      () match {
      
        // @LINE:16
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "login")
      
      }
    
    }
  
  }

  // @LINE:35
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}

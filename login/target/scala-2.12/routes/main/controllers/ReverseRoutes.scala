// @GENERATOR:play-routes-compiler
// @SOURCE:/home/admin1/Documents/play framework/login/conf/routes
// @DATE:Tue May 21 18:55:53 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:14
  class ReverseRegistrationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:14
    def getUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sample")
    }
  
    // @LINE:17
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:19
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:11
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "data")
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}

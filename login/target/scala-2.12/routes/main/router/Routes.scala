// @GENERATOR:play-routes-compiler
// @SOURCE:/home/admin1/Documents/play framework/login/conf/routes
// @DATE:Tue May 21 18:55:53 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:9
  Assets_0: controllers.Assets,
  // @LINE:14
  RegistrationController_1: controllers.RegistrationController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:9
    Assets_0: controllers.Assets,
    // @LINE:14
    RegistrationController_1: controllers.RegistrationController
  ) = this(errorHandler, HomeController_2, Assets_0, RegistrationController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, Assets_0, RegistrationController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """data""", """controllers.HomeController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sample""", """controllers.RegistrationController.getUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.RegistrationController.register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.RegistrationController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.RegistrationController.save()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("data")))
  )
  private[this] lazy val controllers_HomeController_message2_invoker = createInvoker(
    HomeController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "message",
      Nil,
      "GET",
      this.prefix + """data""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_RegistrationController_getUsers3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sample")))
  )
  private[this] lazy val controllers_RegistrationController_getUsers3_invoker = createInvoker(
    RegistrationController_1.getUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "getUsers",
      Nil,
      "GET",
      this.prefix + """sample""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:17
  private[this] lazy val controllers_RegistrationController_register4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegistrationController_register4_invoker = createInvoker(
    RegistrationController_1.register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:19
  private[this] lazy val controllers_RegistrationController_login5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_RegistrationController_login5_invoker = createInvoker(
    RegistrationController_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_RegistrationController_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegistrationController_save6_invoker = createInvoker(
    RegistrationController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "save",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq("""nocsrf""")
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_HomeController_message2_route(params@_) =>
      call { 
        controllers_HomeController_message2_invoker.call(HomeController_2.message)
      }
  
    // @LINE:14
    case controllers_RegistrationController_getUsers3_route(params@_) =>
      call { 
        controllers_RegistrationController_getUsers3_invoker.call(RegistrationController_1.getUsers())
      }
  
    // @LINE:17
    case controllers_RegistrationController_register4_route(params@_) =>
      call { 
        controllers_RegistrationController_register4_invoker.call(RegistrationController_1.register)
      }
  
    // @LINE:19
    case controllers_RegistrationController_login5_route(params@_) =>
      call { 
        controllers_RegistrationController_login5_invoker.call(RegistrationController_1.login)
      }
  
    // @LINE:22
    case controllers_RegistrationController_save6_route(params@_) =>
      call { 
        controllers_RegistrationController_save6_invoker.call(RegistrationController_1.save())
      }
  }
}

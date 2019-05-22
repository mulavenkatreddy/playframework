
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

object registerpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm:Form[Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.31*/(""" 
"""),format.raw/*3.1*/("""<html>
<head>
	<title>welcome to Registeration page</title>
</head>
<body>
<div align="center">
<h1>Register</h1>
"""),_display_(/*10.2*/helper/*10.8*/.form(action = routes.RegistrationController.save())/*10.60*/{_display_(Seq[Any](format.raw/*10.61*/("""

			"""),_display_(/*12.5*/helper/*12.11*/.inputText(registerForm("firstName"))),format.raw/*12.48*/("""
			"""),_display_(/*13.5*/helper/*13.11*/.inputText(registerForm("lastName"))),format.raw/*13.47*/("""
			"""),_display_(/*14.5*/helper/*14.11*/.inputText(registerForm("mobileNumber"))),format.raw/*14.51*/("""
			"""),_display_(/*15.5*/helper/*15.11*/.inputText(registerForm("emailId"))),format.raw/*15.46*/("""
			"""),_display_(/*16.5*/helper/*16.11*/.inputPassword(registerForm("password"))),format.raw/*16.51*/("""
			
			"""),format.raw/*18.4*/("""<input type="submit" value="Register">
""")))}),format.raw/*19.2*/("""
"""),format.raw/*20.1*/("""<form action="/login">
    <input type="submit" value="Login" />
</form>
</body>
</body>
</html>
"""))
      }
    }
  }

  def render(registerForm:Form[Register]): play.twirl.api.HtmlFormat.Appendable = apply(registerForm)

  def f:((Form[Register]) => play.twirl.api.HtmlFormat.Appendable) = (registerForm) => apply(registerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 22 19:15:00 IST 2019
                  SOURCE: /home/admin1/Documents/play framework/login/app/views/registerpage.scala.html
                  HASH: 16e26e8f523d047d774b19937df0a83d61825f07
                  MATRIX: 963->1|1065->33|1110->30|1138->49|1279->164|1293->170|1354->222|1393->223|1425->229|1440->235|1498->272|1529->277|1544->283|1601->319|1632->324|1647->330|1708->370|1739->375|1754->381|1810->416|1841->421|1856->427|1917->467|1952->475|2022->515|2050->516
                  LINES: 28->1|31->2|34->1|35->3|42->10|42->10|42->10|42->10|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|50->18|51->19|52->20
                  -- GENERATED --
              */
          
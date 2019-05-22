
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

object loginpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm:Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.25*/(""" 
"""),format.raw/*3.1*/("""<html>
<head>
	<title>welcome to Login page</title>
</head>
<body>
<div align="center">
<h1>Login to play framework</h1>
"""),_display_(/*10.2*/helper/*10.8*/.form(action = routes.RegistrationController.verifyLogin())/*10.67*/{_display_(Seq[Any](format.raw/*10.68*/("""

			"""),_display_(/*12.5*/helper/*12.11*/.inputText(loginForm("emailId"))),format.raw/*12.43*/("""
			"""),_display_(/*13.5*/helper/*13.11*/.inputPassword(loginForm("password"))),format.raw/*13.48*/("""
			"""),format.raw/*14.4*/("""<input type="submit" value="Login">
	""")))}),format.raw/*15.3*/("""
"""),format.raw/*16.1*/("""</body>
</body>
</html>
"""))
      }
    }
  }

  def render(loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 22 19:11:41 IST 2019
                  SOURCE: /home/admin1/Documents/play framework/login/app/views/loginpage.scala.html
                  HASH: a84b58a5b6c71d18c69628d74906466e1fd62af7
                  MATRIX: 957->1|1053->27|1098->24|1126->43|1274->165|1288->171|1356->230|1395->231|1427->237|1442->243|1495->275|1526->280|1541->286|1599->323|1630->327|1698->365|1726->366
                  LINES: 28->1|31->2|34->1|35->3|42->10|42->10|42->10|42->10|44->12|44->12|44->12|45->13|45->13|45->13|46->14|47->15|48->16
                  -- GENERATED --
              */
          
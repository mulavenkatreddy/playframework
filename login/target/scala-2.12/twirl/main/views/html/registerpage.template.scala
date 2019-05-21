
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


Seq[Any](format.raw/*1.31*/(""" """),format.raw/*1.32*/("""(implicit request: Http.Request)
"""),format.raw/*3.1*/("""<html>
<head>
	<title>welcome to Registeration page</title>
</head>
<body>
<div align="center">
<h1>Register</h1>
"""),_display_(/*10.2*/helper/*10.8*/.form(action = routes.RegistrationController.save())/*10.60*/{_display_(Seq[Any](format.raw/*10.61*/("""

			"""),_display_(/*12.5*/helper/*12.11*/.inputText(registerForm("id"))),format.raw/*12.41*/("""
			"""),_display_(/*13.5*/helper/*13.11*/.inputText(registerForm("FirstName"))),format.raw/*13.48*/("""
			"""),_display_(/*14.5*/helper/*14.11*/.inputText(registerForm("LastName"))),format.raw/*14.47*/("""
			"""),_display_(/*15.5*/helper/*15.11*/.inputText(registerForm("Mobilenumber"))),format.raw/*15.51*/("""
			"""),_display_(/*16.5*/helper/*16.11*/.inputText(registerForm("EmailId"))),format.raw/*16.46*/("""
			"""),_display_(/*17.5*/helper/*17.11*/.inputText(registerForm("Password"))),format.raw/*17.47*/("""
			
			"""),format.raw/*19.4*/("""<input type="submit" value="Register">
			<input type="submit" value="Login">
""")))}),format.raw/*21.2*/("""
"""),format.raw/*22.1*/("""</body>
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
                  DATE: Tue May 21 19:25:53 IST 2019
                  SOURCE: /home/admin1/Documents/play framework/login/app/views/registerpage.scala.html
                  HASH: 8742e256f76594dd0a37739efbe01a917804f0ad
                  MATRIX: 963->1|1065->65|1110->30|1138->31|1197->81|1338->196|1352->202|1413->254|1452->255|1484->261|1499->267|1550->297|1581->302|1596->308|1654->345|1685->350|1700->356|1757->392|1788->397|1803->403|1864->443|1895->448|1910->454|1966->489|1997->494|2012->500|2069->536|2104->544|2213->623|2241->624
                  LINES: 28->1|31->2|34->1|34->1|35->3|42->10|42->10|42->10|42->10|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|51->19|53->21|54->22
                  -- GENERATED --
              */
          
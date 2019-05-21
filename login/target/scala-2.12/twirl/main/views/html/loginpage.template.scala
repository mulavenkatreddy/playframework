
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

object loginpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html>
<head>
	<title>welcome to Registeration page</title>
</head>
<body>
<div align="center">
EmailID: <input type="email" name="EmailID" ><br>
Password: <input type="password" name="Password" ><br>
<input type="submit" value="Login">
<input type="submit" value="Register">
</div>
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
                  DATE: Tue May 21 10:48:27 IST 2019
                  SOURCE: /home/admin1/Documents/play framework/login/app/views/loginpage.scala.html
                  HASH: 0f54c0d32fbc2ea336ffd7cdf41777eb9ac77ede
                  MATRIX: 1034->0
                  LINES: 33->1
                  -- GENERATED --
              */
          
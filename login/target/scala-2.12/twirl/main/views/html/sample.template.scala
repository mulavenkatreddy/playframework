
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

object sample extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users:List[Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<h1>List of all users</h1>
	"""),_display_(/*4.3*/for(user <- users) yield /*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
		"""),format.raw/*5.3*/("""<p> ID:"""),_display_(/*5.11*/user/*5.15*/.id),format.raw/*5.18*/("""</p>
		<p> Firstname:"""),_display_(/*6.18*/user/*6.22*/.firstName),format.raw/*6.32*/("""</p>
		<p> Lastname:"""),_display_(/*7.17*/user/*7.21*/.lastName),format.raw/*7.30*/("""</p>
		<p> Mobilenumber:"""),_display_(/*8.21*/user/*8.25*/.mobileNumber),format.raw/*8.38*/("""</p>
		<p> Emailid:"""),_display_(/*9.16*/user/*9.20*/.emailId),format.raw/*9.28*/("""</p>
		<p> Password:"""),_display_(/*10.17*/user/*10.21*/.pass),format.raw/*10.26*/(""" """),format.raw/*10.27*/("""</p>
		
		
	""")))}),format.raw/*13.3*/("""

"""))
      }
    }
  }

  def render(users:List[Register]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[Register]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 22 14:42:26 IST 2019
                  SOURCE: /home/admin1/Documents/play framework/login/app/views/sample.scala.html
                  HASH: d441baf0e76a12996e09792b736225e21ca68a58
                  MATRIX: 957->1|1073->24|1100->25|1154->54|1187->72|1225->73|1254->76|1288->84|1300->88|1323->91|1371->113|1383->117|1413->127|1460->148|1472->152|1501->161|1552->186|1564->190|1597->203|1643->223|1655->227|1683->235|1731->256|1744->260|1770->265|1799->266|1842->279
                  LINES: 28->1|33->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|41->10|44->13
                  -- GENERATED --
              */
          
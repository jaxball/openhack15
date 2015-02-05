
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href="//netdna.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

        <script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.2.15/angular.min.js"></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/app.js")),format.raw/*15.61*/(""""></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("javascripts/services.js")),format.raw/*16.66*/(""""></script>
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.at("javascripts/controllers.js")),format.raw/*17.69*/(""""></script>
        
    </head>
    <body ng-app="sseChat">
        
        <div ng-controller="ChatCtrl">
            <div id="header">
                Your Name: <input type="text" name="user" id="userField" value="John Doe" ng-model="user" />
                <select ng-model="currentRoom" ng-change="setCurrentRoom(currentRoom)" 
                  ng-options="r.name for r in rooms" id="roomSelect"></select>
            </div>

            <div id="chat">
                <div class=""""),format.raw/*30.29*/("""{"""),format.raw/*30.30*/("""{"""),format.raw/*30.31*/("""msg.who"""),format.raw/*30.38*/("""}"""),format.raw/*30.39*/("""}"""),format.raw/*30.40*/(""" msg" ng-repeat="msg in msgs | limitTo:-4"
                ng-class="msg.user === 'Juliet' ? 'juliet' : msg.user !== user ? 'others' : ''">"""),format.raw/*31.97*/("""{"""),format.raw/*31.98*/("""{"""),format.raw/*31.99*/("""msg.time"""),format.raw/*31.107*/("""}"""),format.raw/*31.108*/("""}"""),format.raw/*31.109*/("""<br/>
                    <strong>"""),format.raw/*32.29*/("""{"""),format.raw/*32.30*/("""{"""),format.raw/*32.31*/("""msg.user"""),format.raw/*32.39*/("""}"""),format.raw/*32.40*/("""}"""),format.raw/*32.41*/(""" says: </strong>"""),format.raw/*32.57*/("""{"""),format.raw/*32.58*/("""{"""),format.raw/*32.59*/("""msg.text"""),format.raw/*32.67*/("""}"""),format.raw/*32.68*/("""}"""),format.raw/*32.69*/("""<br/>
                </div>
            </div>

            <div id="footer">
                <form ng-submit="submitMsg()">
                    <input type="text" name="chat" id="textField" ng-model="inputText"
                     placeholder="Say something" class="ng-pristine ng-valid input-block-level" />
                    <input type="button" class="btn btn-primary" id="saySomething" value="Submit" ng-click="submitMsg()" />
                </form>
            </div>
        </div>
 
    </body>
</html>
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 31 01:18:12 PST 2015
                    SOURCE: /Users/jasonlin/Desktop/sse-chat-template-java/test4/app/views/index.scala.html
                    HASH: 3da4079c00f64f7291685765f4540b8d00d22711
                    MATRIX: 774->1|883->16|962->69|987->74|1075->136|1089->142|1143->176|1349->355|1364->361|1417->393|1661->610|1676->616|1729->648|1790->682|1805->688|1863->725|1924->759|1939->765|2000->805|2519->1296|2548->1297|2577->1298|2612->1305|2641->1306|2670->1307|2837->1446|2866->1447|2895->1448|2932->1456|2962->1457|2992->1458|3054->1492|3083->1493|3112->1494|3148->1502|3177->1503|3206->1504|3250->1520|3279->1521|3308->1522|3344->1530|3373->1531|3402->1532
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|58->30|58->30|58->30|58->30|58->30|58->30|59->31|59->31|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|60->32|60->32|60->32|60->32|60->32|60->32|60->32|60->32
                    -- GENERATED --
                */
            
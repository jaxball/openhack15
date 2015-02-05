// @SOURCE:/Users/jasonlin/Desktop/sse-chat-template-java/test4/conf/routes
// @HASH:0dafbb6a04df99cba100ebcaf5c17e79a0981748
// @DATE:Sat Jan 31 01:18:11 PST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import _root_.play.libs.F

import Router.queryString


// @LINE:10
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:10
class ReverseAssets {
    

// @LINE:10
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseChatApplication {
    

// @LINE:6
def chatFeed(room:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chatFeed/" + implicitly[PathBindable[String]].unbind("room", dynamicString(room)))
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:7
def postMessage(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "chat")
}
                                                
    
}
                          
}
                  


// @LINE:10
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:10
class ReverseAssets {
    

// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseChatApplication {
    

// @LINE:6
def chatFeed : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChatApplication.chatFeed",
   """
      function(room) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chatFeed/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("room", encodeURIComponent(room))})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChatApplication.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def postMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChatApplication.postMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chat"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:10
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:10
class ReverseAssets {
    

// @LINE:10
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseChatApplication {
    

// @LINE:6
def chatFeed(room:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChatApplication.chatFeed(room), HandlerDef(this, "", "controllers.ChatApplication", "chatFeed", Seq(classOf[String]), "GET", """""", _prefix + """chatFeed/$room<[^/]+>""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChatApplication.index(), HandlerDef(this, "", "controllers.ChatApplication", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:7
def postMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChatApplication.postMessage(), HandlerDef(this, "", "controllers.ChatApplication", "postMessage", Seq(), "POST", """""", _prefix + """chat""")
)
                      
    
}
                          
}
        
    
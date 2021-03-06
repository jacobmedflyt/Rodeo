// @SOURCE:C:/devl/work/GIT_WS/Rodeo/conf/routes
// @HASH:3dbdbbcb6a28c6e2732239b36643cbdb69b27638
// @DATE:Wed Mar 15 00:44:23 IST 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers {

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class Reversegetter {
    

// @LINE:27
// @LINE:26
def getGroupGelts(szUserName:String, szGroupId:String): Call = {
   (szUserName: @unchecked, szGroupId: @unchecked) match {
// @LINE:26
case (szUserName, szGroupId) if true => Call("GET", _prefix + { _defaultPrefix } + "GET_DEBTS_OF_GROUPS/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)) + "/" + implicitly[PathBindable[String]].unbind("szGroupId", dynamicString(szGroupId)))
                                                        
// @LINE:27
case (szUserName, szGroupId) if true => Call("GET", _prefix + { _defaultPrefix } + "GET_GROUPS_USER/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)) + "/" + implicitly[PathBindable[String]].unbind("szGroupId", dynamicString(szGroupId)))
                                                        
   }
}
                                                

// @LINE:13
def getGelts(userName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GET_GELT/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)))
}
                                                

// @LINE:11
def isUserNameAlreadyExist(USER_NAME:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "CHECK_USER_NAME/" + implicitly[PathBindable[String]].unbind("USER_NAME", dynamicString(USER_NAME)))
}
                                                

// @LINE:14
def getUsers(userName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GET_USERS/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)))
}
                                                

// @LINE:25
def getUserGroupsName(szUserName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GET_USER_GROUPS_NAME/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)))
}
                                                

// @LINE:12
def isEmailAlreadyExist(Email:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "CHECK_EMAIL/" + implicitly[PathBindable[String]].unbind("Email", dynamicString(Email)))
}
                                                

// @LINE:24
def getUserNameOfGroup(szUserName:String, szGroupId:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GET_USERSNAME_OF_GROUPS/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)) + "/" + implicitly[PathBindable[String]].unbind("szGroupId", dynamicString(szGroupId)))
}
                                                

// @LINE:23
def getGroupsUser(szUserName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GET_GROUPS_INFORMATION/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)))
}
                                                

// @LINE:21
def getUserInformation(szUserName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GET_USER_INFORMATION/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)))
}
                                                

// @LINE:22
def getOwnerGroupInformation(szUserName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "GET_OWNER_INFORMATION/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)))
}
                                                

// @LINE:17
def checkIfUserIsDebter(szUserName:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "IS_DEBTER/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)))
}
                                                

// @LINE:10
def isLoginPermited(Username:String, Password:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "LOGIN/" + implicitly[PathBindable[String]].unbind("Username", dynamicString(Username)) + "/" + implicitly[PathBindable[String]].unbind("Password", dynamicString(Password)))
}
                                                
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
class Reversesetter {
    

// @LINE:18
def confirm(szDebterName:String, szAmount:String, szEntitledName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "CONFIRMATION/" + implicitly[PathBindable[String]].unbind("szDebterName", dynamicString(szDebterName)) + "/" + implicitly[PathBindable[String]].unbind("szAmount", dynamicString(szAmount)) + "/" + implicitly[PathBindable[String]].unbind("szEntitledName", dynamicString(szEntitledName)))
}
                                                

// @LINE:32
def uploadFile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "upload")
}
                                                

// @LINE:19
def notConfirm(szDebterName:String, szAmount:String, szEntitledName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "NOT_CONFIRMATION/" + implicitly[PathBindable[String]].unbind("szDebterName", dynamicString(szDebterName)) + "/" + implicitly[PathBindable[String]].unbind("szAmount", dynamicString(szAmount)) + "/" + implicitly[PathBindable[String]].unbind("szEntitledName", dynamicString(szEntitledName)))
}
                                                

// @LINE:16
def registerNewUser(userName:String, telephone:String, email:String, password:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "REGISTER/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)) + "/" + implicitly[PathBindable[String]].unbind("telephone", dynamicString(telephone)) + "/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + "/" + implicitly[PathBindable[String]].unbind("password", dynamicString(password)))
}
                                                

// @LINE:20
def pay(szDebterName:String, szAmount:String, szEntitledName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "PAY/" + implicitly[PathBindable[String]].unbind("szDebterName", dynamicString(szDebterName)) + "/" + implicitly[PathBindable[String]].unbind("szAmount", dynamicString(szAmount)) + "/" + implicitly[PathBindable[String]].unbind("szEntitledName", dynamicString(szEntitledName)))
}
                                                

// @LINE:28
def newTempGelt(szDebterName:String, szAmount:String, szEntitledName:String, szGroupName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "INSERT_TEMP_GELT/" + implicitly[PathBindable[String]].unbind("szDebterName", dynamicString(szDebterName)) + "/" + implicitly[PathBindable[String]].unbind("szAmount", dynamicString(szAmount)) + "/" + implicitly[PathBindable[String]].unbind("szEntitledName", dynamicString(szEntitledName)) + "/" + implicitly[PathBindable[String]].unbind("szGroupName", dynamicString(szGroupName)))
}
                                                

// @LINE:30
def notConfirmDebt(szDebterName:String, szAmount:String, szEntitledName:String, szGroupName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "NOT_CONFIRM_DEBT/" + implicitly[PathBindable[String]].unbind("szDebterName", dynamicString(szDebterName)) + "/" + implicitly[PathBindable[String]].unbind("szAmount", dynamicString(szAmount)) + "/" + implicitly[PathBindable[String]].unbind("szEntitledName", dynamicString(szEntitledName)) + "/" + implicitly[PathBindable[String]].unbind("szGroupName", dynamicString(szGroupName)))
}
                                                

// @LINE:33
def uploadFileWithName(szUserName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "upload/" + implicitly[PathBindable[String]].unbind("szUserName", dynamicString(szUserName)))
}
                                                

// @LINE:29
def confirmDebt(szDebterName:String, szAmount:String, szEntitledName:String, szGroupName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "CONFIRM_DEBT/" + implicitly[PathBindable[String]].unbind("szDebterName", dynamicString(szDebterName)) + "/" + implicitly[PathBindable[String]].unbind("szAmount", dynamicString(szAmount)) + "/" + implicitly[PathBindable[String]].unbind("szEntitledName", dynamicString(szEntitledName)) + "/" + implicitly[PathBindable[String]].unbind("szGroupName", dynamicString(szGroupName)))
}
                                                

// @LINE:15
def newGelt(szDebterName:String, szAmount:String, szEntitledName:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "INSERT_GELT/" + implicitly[PathBindable[String]].unbind("szDebterName", dynamicString(szDebterName)) + "/" + implicitly[PathBindable[String]].unbind("szAmount", dynamicString(szAmount)) + "/" + implicitly[PathBindable[String]].unbind("szEntitledName", dynamicString(szEntitledName)))
}
                                                
    
}
                          

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseApplication {
    

// @LINE:9
def Main(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "MAIN")
}
                                                

// @LINE:8
def Register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "REGISTER_PAGE")
}
                                                

// @LINE:7
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.javascript {

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class Reversegetter {
    

// @LINE:27
// @LINE:26
def getGroupGelts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getGroupGelts",
   """
      function(szUserName, szGroupId) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_DEBTS_OF_GROUPS/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szGroupId", encodeURIComponent(szGroupId))})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_GROUPS_USER/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szGroupId", encodeURIComponent(szGroupId))})
      }
      }
   """
)
                        

// @LINE:13
def getGelts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getGelts",
   """
      function(userName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_GELT/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName))})
      }
   """
)
                        

// @LINE:11
def isUserNameAlreadyExist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.isUserNameAlreadyExist",
   """
      function(USER_NAME) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "CHECK_USER_NAME/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("USER_NAME", encodeURIComponent(USER_NAME))})
      }
   """
)
                        

// @LINE:14
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getUsers",
   """
      function(userName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_USERS/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName))})
      }
   """
)
                        

// @LINE:25
def getUserGroupsName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getUserGroupsName",
   """
      function(szUserName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_USER_GROUPS_NAME/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName))})
      }
   """
)
                        

// @LINE:12
def isEmailAlreadyExist : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.isEmailAlreadyExist",
   """
      function(Email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "CHECK_EMAIL/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Email", encodeURIComponent(Email))})
      }
   """
)
                        

// @LINE:24
def getUserNameOfGroup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getUserNameOfGroup",
   """
      function(szUserName,szGroupId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_USERSNAME_OF_GROUPS/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szGroupId", encodeURIComponent(szGroupId))})
      }
   """
)
                        

// @LINE:23
def getGroupsUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getGroupsUser",
   """
      function(szUserName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_GROUPS_INFORMATION/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName))})
      }
   """
)
                        

// @LINE:21
def getUserInformation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getUserInformation",
   """
      function(szUserName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_USER_INFORMATION/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName))})
      }
   """
)
                        

// @LINE:22
def getOwnerGroupInformation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.getOwnerGroupInformation",
   """
      function(szUserName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GET_OWNER_INFORMATION/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName))})
      }
   """
)
                        

// @LINE:17
def checkIfUserIsDebter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.checkIfUserIsDebter",
   """
      function(szUserName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "IS_DEBTER/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName))})
      }
   """
)
                        

// @LINE:10
def isLoginPermited : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.getter.isLoginPermited",
   """
      function(Username,Password) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "LOGIN/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Username", encodeURIComponent(Username)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("Password", encodeURIComponent(Password))})
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
class Reversesetter {
    

// @LINE:18
def confirm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.confirm",
   """
      function(szDebterName,szAmount,szEntitledName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "CONFIRMATION/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szDebterName", encodeURIComponent(szDebterName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szAmount", encodeURIComponent(szAmount)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szEntitledName", encodeURIComponent(szEntitledName))})
      }
   """
)
                        

// @LINE:32
def uploadFile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.uploadFile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
      }
   """
)
                        

// @LINE:19
def notConfirm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.notConfirm",
   """
      function(szDebterName,szAmount,szEntitledName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "NOT_CONFIRMATION/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szDebterName", encodeURIComponent(szDebterName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szAmount", encodeURIComponent(szAmount)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szEntitledName", encodeURIComponent(szEntitledName))})
      }
   """
)
                        

// @LINE:16
def registerNewUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.registerNewUser",
   """
      function(userName,telephone,email,password) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "REGISTER/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("telephone", encodeURIComponent(telephone)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password))})
      }
   """
)
                        

// @LINE:20
def pay : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.pay",
   """
      function(szDebterName,szAmount,szEntitledName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "PAY/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szDebterName", encodeURIComponent(szDebterName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szAmount", encodeURIComponent(szAmount)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szEntitledName", encodeURIComponent(szEntitledName))})
      }
   """
)
                        

// @LINE:28
def newTempGelt : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.newTempGelt",
   """
      function(szDebterName,szAmount,szEntitledName,szGroupName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "INSERT_TEMP_GELT/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szDebterName", encodeURIComponent(szDebterName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szAmount", encodeURIComponent(szAmount)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szEntitledName", encodeURIComponent(szEntitledName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szGroupName", encodeURIComponent(szGroupName))})
      }
   """
)
                        

// @LINE:30
def notConfirmDebt : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.notConfirmDebt",
   """
      function(szDebterName,szAmount,szEntitledName,szGroupName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "NOT_CONFIRM_DEBT/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szDebterName", encodeURIComponent(szDebterName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szAmount", encodeURIComponent(szAmount)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szEntitledName", encodeURIComponent(szEntitledName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szGroupName", encodeURIComponent(szGroupName))})
      }
   """
)
                        

// @LINE:33
def uploadFileWithName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.uploadFileWithName",
   """
      function(szUserName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szUserName", encodeURIComponent(szUserName))})
      }
   """
)
                        

// @LINE:29
def confirmDebt : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.confirmDebt",
   """
      function(szDebterName,szAmount,szEntitledName,szGroupName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "CONFIRM_DEBT/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szDebterName", encodeURIComponent(szDebterName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szAmount", encodeURIComponent(szAmount)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szEntitledName", encodeURIComponent(szEntitledName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szGroupName", encodeURIComponent(szGroupName))})
      }
   """
)
                        

// @LINE:15
def newGelt : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.setter.newGelt",
   """
      function(szDebterName,szAmount,szEntitledName) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "INSERT_GELT/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szDebterName", encodeURIComponent(szDebterName)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szAmount", encodeURIComponent(szAmount)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("szEntitledName", encodeURIComponent(szEntitledName))})
      }
   """
)
                        
    
}
              

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseApplication {
    

// @LINE:9
def Main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Main",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "MAIN"})
      }
   """
)
                        

// @LINE:8
def Register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "REGISTER_PAGE"})
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
package controllers.ref {


// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class Reversegetter {
    

// @LINE:26
def getGroupGelts(szUserName:String, szGroupId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getGroupGelts(szUserName, szGroupId), HandlerDef(this, "controllers.getter", "getGroupGelts", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """GET_DEBTS_OF_GROUPS/$szUserName<[^/]+>/$szGroupId<[^/]+>""")
)
                      

// @LINE:13
def getGelts(userName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getGelts(userName), HandlerDef(this, "controllers.getter", "getGelts", Seq(classOf[String]), "GET", """""", _prefix + """GET_GELT/$userName<[^/]+>""")
)
                      

// @LINE:11
def isUserNameAlreadyExist(USER_NAME:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.isUserNameAlreadyExist(USER_NAME), HandlerDef(this, "controllers.getter", "isUserNameAlreadyExist", Seq(classOf[String]), "GET", """""", _prefix + """CHECK_USER_NAME/$USER_NAME<[^/]+>""")
)
                      

// @LINE:14
def getUsers(userName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getUsers(userName), HandlerDef(this, "controllers.getter", "getUsers", Seq(classOf[String]), "GET", """""", _prefix + """GET_USERS/$userName<[^/]+>""")
)
                      

// @LINE:25
def getUserGroupsName(szUserName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getUserGroupsName(szUserName), HandlerDef(this, "controllers.getter", "getUserGroupsName", Seq(classOf[String]), "GET", """""", _prefix + """GET_USER_GROUPS_NAME/$szUserName<[^/]+>""")
)
                      

// @LINE:12
def isEmailAlreadyExist(Email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.isEmailAlreadyExist(Email), HandlerDef(this, "controllers.getter", "isEmailAlreadyExist", Seq(classOf[String]), "GET", """""", _prefix + """CHECK_EMAIL/$Email<[^/]+>""")
)
                      

// @LINE:24
def getUserNameOfGroup(szUserName:String, szGroupId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getUserNameOfGroup(szUserName, szGroupId), HandlerDef(this, "controllers.getter", "getUserNameOfGroup", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """GET_USERSNAME_OF_GROUPS/$szUserName<[^/]+>/$szGroupId<[^/]+>""")
)
                      

// @LINE:23
def getGroupsUser(szUserName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getGroupsUser(szUserName), HandlerDef(this, "controllers.getter", "getGroupsUser", Seq(classOf[String]), "GET", """""", _prefix + """GET_GROUPS_INFORMATION/$szUserName<[^/]+>""")
)
                      

// @LINE:21
def getUserInformation(szUserName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getUserInformation(szUserName), HandlerDef(this, "controllers.getter", "getUserInformation", Seq(classOf[String]), "GET", """""", _prefix + """GET_USER_INFORMATION/$szUserName<[^/]+>""")
)
                      

// @LINE:22
def getOwnerGroupInformation(szUserName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.getOwnerGroupInformation(szUserName), HandlerDef(this, "controllers.getter", "getOwnerGroupInformation", Seq(classOf[String]), "GET", """""", _prefix + """GET_OWNER_INFORMATION/$szUserName<[^/]+>""")
)
                      

// @LINE:17
def checkIfUserIsDebter(szUserName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.checkIfUserIsDebter(szUserName), HandlerDef(this, "controllers.getter", "checkIfUserIsDebter", Seq(classOf[String]), "GET", """""", _prefix + """IS_DEBTER/$szUserName<[^/]+>""")
)
                      

// @LINE:10
def isLoginPermited(Username:String, Password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.getter.isLoginPermited(Username, Password), HandlerDef(this, "controllers.getter", "isLoginPermited", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """LOGIN/$Username<[^/]+>/$Password<[^/]+>""")
)
                      
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:16
// @LINE:15
class Reversesetter {
    

// @LINE:18
def confirm(szDebterName:String, szAmount:String, szEntitledName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.confirm(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "confirm", Seq(classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """CONFIRMATION/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""")
)
                      

// @LINE:32
def uploadFile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.uploadFile(), HandlerDef(this, "controllers.setter", "uploadFile", Seq(), "POST", """ Upload file to the server""", _prefix + """upload""")
)
                      

// @LINE:19
def notConfirm(szDebterName:String, szAmount:String, szEntitledName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.notConfirm(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "notConfirm", Seq(classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """NOT_CONFIRMATION/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""")
)
                      

// @LINE:16
def registerNewUser(userName:String, telephone:String, email:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.registerNewUser(userName, telephone, email, password), HandlerDef(this, "controllers.setter", "registerNewUser", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """REGISTER/$userName<[^/]+>/$telephone<[^/]+>/$email<[^/]+>/$password<[^/]+>""")
)
                      

// @LINE:20
def pay(szDebterName:String, szAmount:String, szEntitledName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.pay(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "pay", Seq(classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """PAY/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""")
)
                      

// @LINE:28
def newTempGelt(szDebterName:String, szAmount:String, szEntitledName:String, szGroupName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.newTempGelt(szDebterName, szAmount, szEntitledName, szGroupName), HandlerDef(this, "controllers.setter", "newTempGelt", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """INSERT_TEMP_GELT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>/$szGroupName<[^/]+>""")
)
                      

// @LINE:30
def notConfirmDebt(szDebterName:String, szAmount:String, szEntitledName:String, szGroupName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.notConfirmDebt(szDebterName, szAmount, szEntitledName, szGroupName), HandlerDef(this, "controllers.setter", "notConfirmDebt", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """NOT_CONFIRM_DEBT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>/$szGroupName<[^/]+>""")
)
                      

// @LINE:33
def uploadFileWithName(szUserName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.uploadFileWithName(szUserName), HandlerDef(this, "controllers.setter", "uploadFileWithName", Seq(classOf[String]), "POST", """""", _prefix + """upload/$szUserName<[^/]+>""")
)
                      

// @LINE:29
def confirmDebt(szDebterName:String, szAmount:String, szEntitledName:String, szGroupName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.confirmDebt(szDebterName, szAmount, szEntitledName, szGroupName), HandlerDef(this, "controllers.setter", "confirmDebt", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """CONFIRM_DEBT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>/$szGroupName<[^/]+>""")
)
                      

// @LINE:15
def newGelt(szDebterName:String, szAmount:String, szEntitledName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.setter.newGelt(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "newGelt", Seq(classOf[String], classOf[String], classOf[String]), "POST", """""", _prefix + """INSERT_GELT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""")
)
                      
    
}
                          

// @LINE:35
class ReverseAssets {
    

// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseApplication {
    

// @LINE:9
def Main(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Main(), HandlerDef(this, "controllers.Application", "Main", Seq(), "GET", """""", _prefix + """MAIN""")
)
                      

// @LINE:8
def Register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Register(), HandlerDef(this, "controllers.Application", "Register", Seq(), "GET", """""", _prefix + """REGISTER_PAGE""")
)
                      

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    
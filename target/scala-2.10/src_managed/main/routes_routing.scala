// @SOURCE:C:/devl/work/GIT_WS/Rodeo/conf/routes
// @HASH:3dbdbbcb6a28c6e2732239b36643cbdb69b27638
// @DATE:Wed Mar 15 00:44:23 IST 2017


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_Register1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("REGISTER_PAGE"))))
        

// @LINE:9
private[this] lazy val controllers_Application_Main2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("MAIN"))))
        

// @LINE:10
private[this] lazy val controllers_getter_isLoginPermited3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("LOGIN/"),DynamicPart("Username", """[^/]+""",true),StaticPart("/"),DynamicPart("Password", """[^/]+""",true))))
        

// @LINE:11
private[this] lazy val controllers_getter_isUserNameAlreadyExist4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("CHECK_USER_NAME/"),DynamicPart("USER_NAME", """[^/]+""",true))))
        

// @LINE:12
private[this] lazy val controllers_getter_isEmailAlreadyExist5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("CHECK_EMAIL/"),DynamicPart("Email", """[^/]+""",true))))
        

// @LINE:13
private[this] lazy val controllers_getter_getGelts6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GET_GELT/"),DynamicPart("userName", """[^/]+""",true))))
        

// @LINE:14
private[this] lazy val controllers_getter_getUsers7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GET_USERS/"),DynamicPart("userName", """[^/]+""",true))))
        

// @LINE:15
private[this] lazy val controllers_setter_newGelt8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("INSERT_GELT/"),DynamicPart("szDebterName", """[^/]+""",true),StaticPart("/"),DynamicPart("szAmount", """[^/]+""",true),StaticPart("/"),DynamicPart("szEntitledName", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_setter_registerNewUser9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("REGISTER/"),DynamicPart("userName", """[^/]+""",true),StaticPart("/"),DynamicPart("telephone", """[^/]+""",true),StaticPart("/"),DynamicPart("email", """[^/]+""",true),StaticPart("/"),DynamicPart("password", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_getter_checkIfUserIsDebter10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("IS_DEBTER/"),DynamicPart("szUserName", """[^/]+""",true))))
        

// @LINE:18
private[this] lazy val controllers_setter_confirm11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("CONFIRMATION/"),DynamicPart("szDebterName", """[^/]+""",true),StaticPart("/"),DynamicPart("szAmount", """[^/]+""",true),StaticPart("/"),DynamicPart("szEntitledName", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_setter_notConfirm12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("NOT_CONFIRMATION/"),DynamicPart("szDebterName", """[^/]+""",true),StaticPart("/"),DynamicPart("szAmount", """[^/]+""",true),StaticPart("/"),DynamicPart("szEntitledName", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_setter_pay13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("PAY/"),DynamicPart("szDebterName", """[^/]+""",true),StaticPart("/"),DynamicPart("szAmount", """[^/]+""",true),StaticPart("/"),DynamicPart("szEntitledName", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_getter_getUserInformation14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GET_USER_INFORMATION/"),DynamicPart("szUserName", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_getter_getOwnerGroupInformation15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GET_OWNER_INFORMATION/"),DynamicPart("szUserName", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_getter_getGroupsUser16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GET_GROUPS_INFORMATION/"),DynamicPart("szUserName", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_getter_getUserNameOfGroup17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GET_USERSNAME_OF_GROUPS/"),DynamicPart("szUserName", """[^/]+""",true),StaticPart("/"),DynamicPart("szGroupId", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_getter_getUserGroupsName18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GET_USER_GROUPS_NAME/"),DynamicPart("szUserName", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_getter_getGroupGelts19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GET_DEBTS_OF_GROUPS/"),DynamicPart("szUserName", """[^/]+""",true),StaticPart("/"),DynamicPart("szGroupId", """[^/]+""",true))))
        

// @LINE:27
private[this] lazy val controllers_getter_getGroupGelts20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("GET_GROUPS_USER/"),DynamicPart("szUserName", """[^/]+""",true),StaticPart("/"),DynamicPart("szGroupId", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_setter_newTempGelt21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("INSERT_TEMP_GELT/"),DynamicPart("szDebterName", """[^/]+""",true),StaticPart("/"),DynamicPart("szAmount", """[^/]+""",true),StaticPart("/"),DynamicPart("szEntitledName", """[^/]+""",true),StaticPart("/"),DynamicPart("szGroupName", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_setter_confirmDebt22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("CONFIRM_DEBT/"),DynamicPart("szDebterName", """[^/]+""",true),StaticPart("/"),DynamicPart("szAmount", """[^/]+""",true),StaticPart("/"),DynamicPart("szEntitledName", """[^/]+""",true),StaticPart("/"),DynamicPart("szGroupName", """[^/]+""",true))))
        

// @LINE:30
private[this] lazy val controllers_setter_notConfirmDebt23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("NOT_CONFIRM_DEBT/"),DynamicPart("szDebterName", """[^/]+""",true),StaticPart("/"),DynamicPart("szAmount", """[^/]+""",true),StaticPart("/"),DynamicPart("szEntitledName", """[^/]+""",true),StaticPart("/"),DynamicPart("szGroupName", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_setter_uploadFile24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upload"))))
        

// @LINE:33
private[this] lazy val controllers_setter_uploadFileWithName25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upload/"),DynamicPart("szUserName", """[^/]+""",true))))
        

// @LINE:35
private[this] lazy val controllers_Assets_at26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """REGISTER_PAGE""","""controllers.Application.Register()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """MAIN""","""controllers.Application.Main()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """LOGIN/$Username<[^/]+>/$Password<[^/]+>""","""controllers.getter.isLoginPermited(Username:String, Password:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """CHECK_USER_NAME/$USER_NAME<[^/]+>""","""controllers.getter.isUserNameAlreadyExist(USER_NAME:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """CHECK_EMAIL/$Email<[^/]+>""","""controllers.getter.isEmailAlreadyExist(Email:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GET_GELT/$userName<[^/]+>""","""controllers.getter.getGelts(userName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GET_USERS/$userName<[^/]+>""","""controllers.getter.getUsers(userName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """INSERT_GELT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""","""controllers.setter.newGelt(szDebterName:String, szAmount:String, szEntitledName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """REGISTER/$userName<[^/]+>/$telephone<[^/]+>/$email<[^/]+>/$password<[^/]+>""","""controllers.setter.registerNewUser(userName:String, telephone:String, email:String, password:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """IS_DEBTER/$szUserName<[^/]+>""","""controllers.getter.checkIfUserIsDebter(szUserName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """CONFIRMATION/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""","""controllers.setter.confirm(szDebterName:String, szAmount:String, szEntitledName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """NOT_CONFIRMATION/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""","""controllers.setter.notConfirm(szDebterName:String, szAmount:String, szEntitledName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """PAY/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>""","""controllers.setter.pay(szDebterName:String, szAmount:String, szEntitledName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GET_USER_INFORMATION/$szUserName<[^/]+>""","""controllers.getter.getUserInformation(szUserName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GET_OWNER_INFORMATION/$szUserName<[^/]+>""","""controllers.getter.getOwnerGroupInformation(szUserName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GET_GROUPS_INFORMATION/$szUserName<[^/]+>""","""controllers.getter.getGroupsUser(szUserName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GET_USERSNAME_OF_GROUPS/$szUserName<[^/]+>/$szGroupId<[^/]+>""","""controllers.getter.getUserNameOfGroup(szUserName:String, szGroupId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GET_USER_GROUPS_NAME/$szUserName<[^/]+>""","""controllers.getter.getUserGroupsName(szUserName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GET_DEBTS_OF_GROUPS/$szUserName<[^/]+>/$szGroupId<[^/]+>""","""controllers.getter.getGroupGelts(szUserName:String, szGroupId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """GET_GROUPS_USER/$szUserName<[^/]+>/$szGroupId<[^/]+>""","""controllers.getter.getGroupGelts(szUserName:String, szGroupId:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """INSERT_TEMP_GELT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>/$szGroupName<[^/]+>""","""controllers.setter.newTempGelt(szDebterName:String, szAmount:String, szEntitledName:String, szGroupName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """CONFIRM_DEBT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>/$szGroupName<[^/]+>""","""controllers.setter.confirmDebt(szDebterName:String, szAmount:String, szEntitledName:String, szGroupName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """NOT_CONFIRM_DEBT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>/$szGroupName<[^/]+>""","""controllers.setter.notConfirmDebt(szDebterName:String, szAmount:String, szEntitledName:String, szGroupName:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload""","""controllers.setter.uploadFile"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload/$szUserName<[^/]+>""","""controllers.setter.uploadFileWithName(szUserName:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_Register1(params) => {
   call { 
        invokeHandler(controllers.Application.Register(), HandlerDef(this, "controllers.Application", "Register", Nil,"GET", """""", Routes.prefix + """REGISTER_PAGE"""))
   }
}
        

// @LINE:9
case controllers_Application_Main2(params) => {
   call { 
        invokeHandler(controllers.Application.Main(), HandlerDef(this, "controllers.Application", "Main", Nil,"GET", """""", Routes.prefix + """MAIN"""))
   }
}
        

// @LINE:10
case controllers_getter_isLoginPermited3(params) => {
   call(params.fromPath[String]("Username", None), params.fromPath[String]("Password", None)) { (Username, Password) =>
        invokeHandler(controllers.getter.isLoginPermited(Username, Password), HandlerDef(this, "controllers.getter", "isLoginPermited", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """LOGIN/$Username<[^/]+>/$Password<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_getter_isUserNameAlreadyExist4(params) => {
   call(params.fromPath[String]("USER_NAME", None)) { (USER_NAME) =>
        invokeHandler(controllers.getter.isUserNameAlreadyExist(USER_NAME), HandlerDef(this, "controllers.getter", "isUserNameAlreadyExist", Seq(classOf[String]),"GET", """""", Routes.prefix + """CHECK_USER_NAME/$USER_NAME<[^/]+>"""))
   }
}
        

// @LINE:12
case controllers_getter_isEmailAlreadyExist5(params) => {
   call(params.fromPath[String]("Email", None)) { (Email) =>
        invokeHandler(controllers.getter.isEmailAlreadyExist(Email), HandlerDef(this, "controllers.getter", "isEmailAlreadyExist", Seq(classOf[String]),"GET", """""", Routes.prefix + """CHECK_EMAIL/$Email<[^/]+>"""))
   }
}
        

// @LINE:13
case controllers_getter_getGelts6(params) => {
   call(params.fromPath[String]("userName", None)) { (userName) =>
        invokeHandler(controllers.getter.getGelts(userName), HandlerDef(this, "controllers.getter", "getGelts", Seq(classOf[String]),"GET", """""", Routes.prefix + """GET_GELT/$userName<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_getter_getUsers7(params) => {
   call(params.fromPath[String]("userName", None)) { (userName) =>
        invokeHandler(controllers.getter.getUsers(userName), HandlerDef(this, "controllers.getter", "getUsers", Seq(classOf[String]),"GET", """""", Routes.prefix + """GET_USERS/$userName<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_setter_newGelt8(params) => {
   call(params.fromPath[String]("szDebterName", None), params.fromPath[String]("szAmount", None), params.fromPath[String]("szEntitledName", None)) { (szDebterName, szAmount, szEntitledName) =>
        invokeHandler(controllers.setter.newGelt(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "newGelt", Seq(classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """INSERT_GELT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_setter_registerNewUser9(params) => {
   call(params.fromPath[String]("userName", None), params.fromPath[String]("telephone", None), params.fromPath[String]("email", None), params.fromPath[String]("password", None)) { (userName, telephone, email, password) =>
        invokeHandler(controllers.setter.registerNewUser(userName, telephone, email, password), HandlerDef(this, "controllers.setter", "registerNewUser", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """REGISTER/$userName<[^/]+>/$telephone<[^/]+>/$email<[^/]+>/$password<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_getter_checkIfUserIsDebter10(params) => {
   call(params.fromPath[String]("szUserName", None)) { (szUserName) =>
        invokeHandler(controllers.getter.checkIfUserIsDebter(szUserName), HandlerDef(this, "controllers.getter", "checkIfUserIsDebter", Seq(classOf[String]),"GET", """""", Routes.prefix + """IS_DEBTER/$szUserName<[^/]+>"""))
   }
}
        

// @LINE:18
case controllers_setter_confirm11(params) => {
   call(params.fromPath[String]("szDebterName", None), params.fromPath[String]("szAmount", None), params.fromPath[String]("szEntitledName", None)) { (szDebterName, szAmount, szEntitledName) =>
        invokeHandler(controllers.setter.confirm(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "confirm", Seq(classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """CONFIRMATION/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_setter_notConfirm12(params) => {
   call(params.fromPath[String]("szDebterName", None), params.fromPath[String]("szAmount", None), params.fromPath[String]("szEntitledName", None)) { (szDebterName, szAmount, szEntitledName) =>
        invokeHandler(controllers.setter.notConfirm(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "notConfirm", Seq(classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """NOT_CONFIRMATION/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_setter_pay13(params) => {
   call(params.fromPath[String]("szDebterName", None), params.fromPath[String]("szAmount", None), params.fromPath[String]("szEntitledName", None)) { (szDebterName, szAmount, szEntitledName) =>
        invokeHandler(controllers.setter.pay(szDebterName, szAmount, szEntitledName), HandlerDef(this, "controllers.setter", "pay", Seq(classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """PAY/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_getter_getUserInformation14(params) => {
   call(params.fromPath[String]("szUserName", None)) { (szUserName) =>
        invokeHandler(controllers.getter.getUserInformation(szUserName), HandlerDef(this, "controllers.getter", "getUserInformation", Seq(classOf[String]),"GET", """""", Routes.prefix + """GET_USER_INFORMATION/$szUserName<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_getter_getOwnerGroupInformation15(params) => {
   call(params.fromPath[String]("szUserName", None)) { (szUserName) =>
        invokeHandler(controllers.getter.getOwnerGroupInformation(szUserName), HandlerDef(this, "controllers.getter", "getOwnerGroupInformation", Seq(classOf[String]),"GET", """""", Routes.prefix + """GET_OWNER_INFORMATION/$szUserName<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_getter_getGroupsUser16(params) => {
   call(params.fromPath[String]("szUserName", None)) { (szUserName) =>
        invokeHandler(controllers.getter.getGroupsUser(szUserName), HandlerDef(this, "controllers.getter", "getGroupsUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """GET_GROUPS_INFORMATION/$szUserName<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_getter_getUserNameOfGroup17(params) => {
   call(params.fromPath[String]("szUserName", None), params.fromPath[String]("szGroupId", None)) { (szUserName, szGroupId) =>
        invokeHandler(controllers.getter.getUserNameOfGroup(szUserName, szGroupId), HandlerDef(this, "controllers.getter", "getUserNameOfGroup", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """GET_USERSNAME_OF_GROUPS/$szUserName<[^/]+>/$szGroupId<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_getter_getUserGroupsName18(params) => {
   call(params.fromPath[String]("szUserName", None)) { (szUserName) =>
        invokeHandler(controllers.getter.getUserGroupsName(szUserName), HandlerDef(this, "controllers.getter", "getUserGroupsName", Seq(classOf[String]),"GET", """""", Routes.prefix + """GET_USER_GROUPS_NAME/$szUserName<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_getter_getGroupGelts19(params) => {
   call(params.fromPath[String]("szUserName", None), params.fromPath[String]("szGroupId", None)) { (szUserName, szGroupId) =>
        invokeHandler(controllers.getter.getGroupGelts(szUserName, szGroupId), HandlerDef(this, "controllers.getter", "getGroupGelts", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """GET_DEBTS_OF_GROUPS/$szUserName<[^/]+>/$szGroupId<[^/]+>"""))
   }
}
        

// @LINE:27
case controllers_getter_getGroupGelts20(params) => {
   call(params.fromPath[String]("szUserName", None), params.fromPath[String]("szGroupId", None)) { (szUserName, szGroupId) =>
        invokeHandler(controllers.getter.getGroupGelts(szUserName, szGroupId), HandlerDef(this, "controllers.getter", "getGroupGelts", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """GET_GROUPS_USER/$szUserName<[^/]+>/$szGroupId<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_setter_newTempGelt21(params) => {
   call(params.fromPath[String]("szDebterName", None), params.fromPath[String]("szAmount", None), params.fromPath[String]("szEntitledName", None), params.fromPath[String]("szGroupName", None)) { (szDebterName, szAmount, szEntitledName, szGroupName) =>
        invokeHandler(controllers.setter.newTempGelt(szDebterName, szAmount, szEntitledName, szGroupName), HandlerDef(this, "controllers.setter", "newTempGelt", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """INSERT_TEMP_GELT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>/$szGroupName<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_setter_confirmDebt22(params) => {
   call(params.fromPath[String]("szDebterName", None), params.fromPath[String]("szAmount", None), params.fromPath[String]("szEntitledName", None), params.fromPath[String]("szGroupName", None)) { (szDebterName, szAmount, szEntitledName, szGroupName) =>
        invokeHandler(controllers.setter.confirmDebt(szDebterName, szAmount, szEntitledName, szGroupName), HandlerDef(this, "controllers.setter", "confirmDebt", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """CONFIRM_DEBT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>/$szGroupName<[^/]+>"""))
   }
}
        

// @LINE:30
case controllers_setter_notConfirmDebt23(params) => {
   call(params.fromPath[String]("szDebterName", None), params.fromPath[String]("szAmount", None), params.fromPath[String]("szEntitledName", None), params.fromPath[String]("szGroupName", None)) { (szDebterName, szAmount, szEntitledName, szGroupName) =>
        invokeHandler(controllers.setter.notConfirmDebt(szDebterName, szAmount, szEntitledName, szGroupName), HandlerDef(this, "controllers.setter", "notConfirmDebt", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """NOT_CONFIRM_DEBT/$szDebterName<[^/]+>/$szAmount<[^/]+>/$szEntitledName<[^/]+>/$szGroupName<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_setter_uploadFile24(params) => {
   call { 
        invokeHandler(controllers.setter.uploadFile, HandlerDef(this, "controllers.setter", "uploadFile", Nil,"POST", """ Upload file to the server""", Routes.prefix + """upload"""))
   }
}
        

// @LINE:33
case controllers_setter_uploadFileWithName25(params) => {
   call(params.fromPath[String]("szUserName", None)) { (szUserName) =>
        invokeHandler(controllers.setter.uploadFileWithName(szUserName), HandlerDef(this, "controllers.setter", "uploadFileWithName", Seq(classOf[String]),"POST", """""", Routes.prefix + """upload/$szUserName<[^/]+>"""))
   }
}
        

// @LINE:35
case controllers_Assets_at26(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     
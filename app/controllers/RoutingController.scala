package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class RoutingController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

    def params(param1: String, param2: String): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
        Ok(s"param1 = $param1, param2 = $param2")
    }
}

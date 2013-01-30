import spray.routing.SimpleRoutingApp
import spray.json._
import spray.httpx.SprayJsonSupport
import akka.actor._
import scala.concurrent.Future

object Boot extends App with SimpleRoutingApp with DefaultJsonProtocol with SprayJsonSupport {
	implicit val resultFormat = jsonFormat1(Result)
	implicit val printer = CompactPrinter

	startServer(interface = "0.0.0.0", port = 8080) {
		path("power" / IntNumber / IntNumber) { (base, exponent) =>
			get {
				complete {
					Future {
						Result(Math.pow(base, exponent).toInt)
					}
				}
			}
		}
	}
}

case class Result(result: Int)
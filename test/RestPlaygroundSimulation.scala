package test

import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import com.excilys.ebi.gatling.http.Headers.Names._
import akka.util.duration._
import bootstrap._

class RestPlaygroundSimulation extends Simulation {

	val httpConf = httpConfig
		.baseURL("http://localhost:8080")
		.acceptHeader("application/json")
		.acceptEncodingHeader("gzip, deflate")

	val powerRequest = http("Power")
		.get("/power/12/7")

	val scn = scenario("Test scenario")
		.repeat(20) {
			exec(powerRequest)
		}

	setUp(scn.users(10000).protocolConfig(httpConf))
}

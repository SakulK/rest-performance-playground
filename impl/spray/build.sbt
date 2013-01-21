import AssemblyKeys._


scalaVersion := "2.10.0"


resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.1.0"

libraryDependencies += "io.spray" % "spray-routing" % "1.1-M7"

libraryDependencies += "io.spray" % "spray-can" % "1.1-M7"

libraryDependencies += "io.spray" %% "spray-json" % "1.2.3"


assemblySettings

jarName in assembly := "spray-impl.jar"
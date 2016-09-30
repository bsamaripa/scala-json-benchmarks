import sbt._

object Dependencies {
  val V = Map(
    "Argonaut"  -> "6.2-M3",
    "Circe"     -> "0.5.2",
    "Jack"      -> "4.8.3",
    "Jackson"   -> "2.8.3",
    "Jawn"      -> "0.10.1",
    "Json4s"    -> "3.4.1",
    "Persist"   -> "1.1.3",
    "Pickling"  -> "0.11.0-M2",
    "PlayJson"  -> "2.5.8",
    "ScalaTest" -> "3.0.0",
    "Rapture"   -> "2.0.0-M7",
    "SprayJson" -> "1.3.2",
    "uPickle"   -> "0.4.1"
  )

  val TestDeps = Seq(
    "org.scalactic" %% "scalactic" % V("ScalaTest"),
    "org.scalatest" %% "scalatest" % V("ScalaTest") % "test"
  )

  val JsonDeps = Seq(
    "io.argonaut"                  %% "argonaut"             % V("Argonaut"),
    "io.circe"                     %% "circe-core"           % V("Circe"),
    "io.circe"                     %% "circe-generic"        % V("Circe"),
    "io.circe"                     %% "circe-parser"         % V("Circe"),
    "io.circe"                     %% "circe-jackson"        % V("Circe"),
    "co.blocke"                    %% "scalajack"            % V("Jack"),
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % V("Jackson"),
    "org.spire-math"               %% "jawn-parser"          % V("Jawn"),
    "org.spire-math"               %% "jawn-ast"             % V("Jawn"),
    "org.json4s"                   %% "json4s-jackson"       % V("Json4s"),
    "org.json4s"                   %% "json4s-native"        % V("Json4s"),
    "com.persist"                  %% "persist-json"         % V("Persist"),
    "org.scala-lang.modules"       %% "scala-pickling"       % V("Pickling"),
    "com.typesafe.play"            %% "play-json"            % V("PlayJson"),
    "com.propensive"               %% "rapture-json"         % V("Rapture"),
    "io.spray"                     %% "spray-json"           % V("SprayJson"),
    "com.lihaoyi"                  %% "upickle"              % V("uPickle")
  )

}
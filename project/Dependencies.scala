import sbt._

object Dependencies {
  val V = Map(
    "Argonaut"   -> "6.2-RC2",
    "Circe"      -> "0.7.0-M1",
    "Jack"       -> "5.0.3",
    "Jackson"    -> "2.8.4",
    "Jawn"       -> "0.10.4",
    "Json4s"     -> "3.5.0",
    "Native"     -> "1.0.4",
    "Persist"    -> "1.2.0",
    "PlayJson"   -> "2.6.0-M1",
    "Pushka"     -> "0.8.0",
    "ScalaMeter" -> "0.8.2",
    "ScalaTest"  -> "3.0.1",
    "Rapture"    -> "2.0.0-M7",
    "SprayJson"  -> "1.3.2"
  )

  val TestDeps = Seq(
    "org.scalactic"     %% "scalactic"  % V("ScalaTest"),
    "org.scalatest"     %% "scalatest"  % V("ScalaTest")  % "it,test",
    "com.storm-enroute" %% "scalameter" % V("ScalaMeter") % "it"
  )

  val JsonDeps = Seq(
    "io.argonaut"                  %% "argonaut"             % V("Argonaut"),
    "io.argonaut"                  %% "argonaut-scalaz"      % V("Argonaut"),
    "io.circe"                     %% "circe-core"           % V("Circe"),
    "io.circe"                     %% "circe-generic"        % V("Circe"),
    "io.circe"                     %% "circe-parser"         % V("Circe"),
    "io.circe"                     %% "circe-jackson"        % V("Circe"),
//    "co.blocke"                    %% "scalajack"            % V("Jack"),
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % V("Jackson"),
    "org.spire-math"               %% "jawn-parser"          % V("Jawn"),
    "org.spire-math"               %% "jawn-ast"             % V("Jawn"),
    "org.json4s"                   %% "json4s-jackson"       % V("Json4s"),
    "org.json4s"                   %% "json4s-native"        % V("Json4s"),
    "org.scala-lang.modules"       %% "scala-parser-combinators"   % V("Native"),
    "com.persist"                  %% "persist-json"         % V("Persist"),
    "com.typesafe.play"            %% "play-json"            % V("PlayJson"),
    "com.github.fomkin"            %% "pushka-json"          % V("Pushka"),
//    "com.propensive"               %% "rapture-json"         % V("Rapture"),
    "io.spray"                     %% "spray-json"           % V("SprayJson")
  )
}

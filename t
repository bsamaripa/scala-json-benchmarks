[1mdiff --git a/build.sbt b/build.sbt[m
[1mindex 77b2b8e..5dd0caa 100644[m
[1m--- a/build.sbt[m
[1m+++ b/build.sbt[m
[36m@@ -8,7 +8,7 @@[m [mlazy val commonSettings = Seq([m
 [m
   version := "0.1.0",[m
 [m
[31m-  scalaVersion := "2.11.8",[m
[32m+[m[32m  scalaVersion := "2.12.1",[m
 [m
   testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework"),[m
 [m
[1mdiff --git a/project/Dependencies.scala b/project/Dependencies.scala[m
[1mindex 4354de8..f306003 100644[m
[1m--- a/project/Dependencies.scala[m
[1m+++ b/project/Dependencies.scala[m
[36m@@ -2,20 +2,20 @@[m [mimport sbt._[m
 [m
 object Dependencies {[m
   val V = Map([m
[31m-    "Argonaut"   -> "6.2-M3",[m
[31m-    "Circe"      -> "0.5.2",[m
[31m-    "Jack"       -> "4.8.3",[m
[31m-    "Jackson"    -> "2.8.3",[m
[31m-    "Jawn"       -> "0.10.1",[m
[31m-    "Json4s"     -> "3.4.1",[m
[31m-    "Persist"    -> "1.1.3",[m
[31m-    "Pickling"   -> "0.11.0-M2",[m
[31m-    "PlayJson"   -> "2.5.8",[m
[31m-    "ScalaMeter" -> "0.7",[m
[31m-    "ScalaTest"  -> "3.0.0",[m
[32m+[m[32m    "Argonaut"   -> "6.2-RC2",[m
[32m+[m[32m    "Circe"      -> "0.7.0-M1",[m
[32m+[m[32m    "Jack"       -> "5.0.3",[m
[32m+[m[32m    "Jackson"    -> "2.8.4",[m
[32m+[m[32m    "Jawn"       -> "0.10.4",[m
[32m+[m[32m    "Json4s"     -> "3.5.0",[m
[32m+[m[32m    "Native"     -> "1.0.4",[m
[32m+[m[32m    "Persist"    -> "1.2.0",[m
[32m+[m[32m    "PlayJson"   -> "2.6.0-M1",[m
[32m+[m[32m    "Pushka"     -> "0.8.0",[m
[32m+[m[32m    "ScalaMeter" -> "0.8.2",[m
[32m+[m[32m    "ScalaTest"  -> "3.0.1",[m
     "Rapture"    -> "2.0.0-M7",[m
[31m-    "SprayJson"  -> "1.3.2",[m
[31m-    "uPickle"    -> "0.4.1"[m
[32m+[m[32m    "SprayJson"  -> "1.3.2"[m
   )[m
 [m
   val TestDeps = Seq([m
[36m@@ -31,18 +31,17 @@[m [mobject Dependencies {[m
     "io.circe"                     %% "circe-generic"        % V("Circe"),[m
     "io.circe"                     %% "circe-parser"         % V("Circe"),[m
     "io.circe"                     %% "circe-jackson"        % V("Circe"),[m
[31m-    "co.blocke"                    %% "scalajack"            % V("Jack"),[m
[32m+[m[32m//    "co.blocke"                    %% "scalajack"            % V("Jack"),[m
     "com.fasterxml.jackson.module" %% "jackson-module-scala" % V("Jackson"),[m
     "org.spire-math"               %% "jawn-parser"          % V("Jawn"),[m
     "org.spire-math"               %% "jawn-ast"             % V("Jawn"),[m
     "org.json4s"                   %% "json4s-jackson"       % V("Json4s"),[m
     "org.json4s"                   %% "json4s-native"        % V("Json4s"),[m
[32m+[m[32m    "org.scala-lang.modules"       %% "scala-parser-combinators"   % V("Native"),[m
     "com.persist"                  %% "persist-json"         % V("Persist"),[m
[31m-    "org.scala-lang.modules"       %% "scala-pickling"       % V("Pickling"),[m
     "com.typesafe.play"            %% "play-json"            % V("PlayJson"),[m
[31m-    "com.propensive"               %% "rapture-json"         % V("Rapture"),[m
[31m-    "io.spray"                     %% "spray-json"           % V("SprayJson"),[m
[31m-    "com.lihaoyi"                  %% "upickle"              % V("uPickle")[m
[32m+[m[32m    "com.github.fomkin"            %% "pushka-json"          % V("Pushka"),[m
[32m+[m[32m//    "com.propensive"               %% "rapture-json"         % V("Rapture"),[m
[32m+[m[32m    "io.spray"                     %% "spray-json"           % V("SprayJson")[m
   )[m
[31m-[m
[31m-}[m
\ No newline at end of file[m
[32m+[m[32m}[m
[1mdiff --git a/project/build.properties b/project/build.properties[m
[1mindex 13d3ee7..b168a33 100644[m
[1m--- a/project/build.properties[m
[1m+++ b/project/build.properties[m
[36m@@ -1 +1 @@[m
[31m-sbt.version = 0.13.12[m
\ No newline at end of file[m
[32m+[m[32msbt.version = 0.13.13[m
[1mdiff --git a/project/plugins.sbt b/project/plugins.sbt[m
[1mindex 14a6ca1..b8583e8 100644[m
[1m--- a/project/plugins.sbt[m
[1m+++ b/project/plugins.sbt[m
[36m@@ -1 +1,8 @@[m
[31m-logLevel := Level.Warn[m
\ No newline at end of file[m
[32m+[m[32mlogLevel := Level.Warn[m
[32m+[m
[32m+[m[32maddCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)[m
[32m+[m
[32m+[m[32m//addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M15")[m
[32m+[m
[32m+[m[32maddSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")[m
[41m+[m
[1mdiff --git a/src/main/scala/com/bsamaripa/Jack.scala b/src/main/scala/com/bsamaripa/Jack.scala[m
[1mindex e3aab7b..23f4b5c 100644[m
[1m--- a/src/main/scala/com/bsamaripa/Jack.scala[m
[1m+++ b/src/main/scala/com/bsamaripa/Jack.scala[m
[36m@@ -1,11 +1,11 @@[m
[31m-package com.bsamaripa[m
[32m+[m[32m//package com.bsamaripa[m
 [m
[31m-import co.blocke.scalajack._[m
[32m+[m[32m//import co.blocke.scalajack._[m
 [m
[31m-object Jack extends Parser {[m
[31m-  def parse(json: String): Person = {[m
[31m-    val sj = ScalaJack()[m
[31m-    val js = sj.render[String](json)[m
[31m-    sj.read[Person](js)[m
[31m-  }[m
[31m-}[m
[32m+[m[32m//object Jack extends Parser {[m
[32m+[m[32m//  def parse(json: String): Person = {[m
[32m+[m[32m//    val sj = ScalaJack()[m
[32m+[m[32m//    val js = sj.render[String](json)[m
[32m+[m[32m//    sj.read[Person](js)[m
[32m+[m[32m//  }[m
[32m+[m[32m//}[m
[1mdiff --git a/src/main/scala/com/bsamaripa/Pickling.scala b/src/main/scala/com/bsamaripa/Pickling.scala[m
[1mdeleted file mode 100644[m
[1mindex 0ebda0f..0000000[m
[1m--- a/src/main/scala/com/bsamaripa/Pickling.scala[m
[1m+++ /dev/null[m
[36m@@ -1,9 +0,0 @@[m
[31m-package com.bsamaripa[m
[31m-[m
[31m-import scala.pickling.Defaults._[m
[31m-import scala.pickling.{json => JSON}[m
[31m-import JSON._[m
[31m-[m
[31m-object Pickling extends Parser {[m
[31m-  def parse(json: String): String = json.pickle.value[m
[31m-}[m
[1mdiff --git a/src/main/scala/com/bsamaripa/uPickle.scala b/src/main/scala/com/bsamaripa/uPickle.scala[m
[1mdeleted file mode 100644[m
[1mindex 2456bfc..0000000[m
[1m--- a/src/main/scala/com/bsamaripa/uPickle.scala[m
[1m+++ /dev/null[m
[36m@@ -1,7 +0,0 @@[m
[31m-package com.bsamaripa[m
[31m-[m
[31m-import upickle.default._[m
[31m-[m
[31m-object uPickle extends Parser {[m
[31m-  def parse(json: String): String = writeJs(json).toString[m
[31m-}[m

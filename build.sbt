import Dependencies._
import sbt.Keys._

lazy val commonSettings = Seq(
  name := "json-benchmarks",

  organization := "com.bsamaripa",

  version := "0.1.0",

  scalaVersion := "2.12.1",

  testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework"),

  logBuffered := false,

  parallelExecution in Test := false,

  parallelExecution in IntegrationTest := false,

  testOptions in Test += Tests.Argument("-oHLSD"), // PrintReporter

  testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "results"), // Html Reporter

  testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-fHLSD", "results/foo.txt"), // File Reporter

  useJCenter := true,

  libraryDependencies ++= JsonDeps ++ TestDeps,

  libraryDependencies += "org.pegdown" % "pegdown" % "1.6.0"
)
lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(commonSettings:_*)
  .settings(Defaults.itSettings: _*)

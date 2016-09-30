import Dependencies._

name := "json-benchmarks"

organization := "com.bsamaripa"

version := "0.1.0"

scalaVersion := "2.11.8"

parallelExecution in Test := false

testOptions in Test += Tests.Argument("-oHLSD") // Useful for running test locally

//testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "results")

useJCenter := true

libraryDependencies ++= JsonDeps ++ TestDeps

libraryDependencies += "org.pegdown" % "pegdown" % "1.6.0"

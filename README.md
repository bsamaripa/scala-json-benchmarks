# Json Benchmarks
[![Build Status](https://travis-ci.org/bsamaripa/scala-json-benchmarks.svg?branch=master)](https://travis-ci.org/bsamaripa/scala-json-benchmarks)

A benchmark of json libraries. The goal is to be as comprehensive as possible.

## Libraries included

* [Argonaut](https://index.scala-lang.org/argonaut-io/argonaut)
* [Circe](https://index.scala-lang.org/travisbrown/circe)
* [ScalaJack](https://index.scala-lang.org/gzoller/scalajack)
* [Jawn](https://index.scala-lang.org/non/jawn)
* [Json4s](https://index.scala-lang.org/json4s/json4s)
* [Scala Json](http://www.scala-lang.org/api/2.11.8/scala-parser-combinators/#scala.util.parsing.json.JSON$)
* [Scala Pickling](https://index.scala-lang.org/scala/pickling)
* [Play Json](https://index.scala-lang.org/playframework/playframework)
* [Rapture](https://index.scala-lang.org/propensive/rapture)
* [Spray Json](https://index.scala-lang.org/spray/spray-json)
* [uPickle](https://index.scala-lang.org/lihaoyi/upickle)


## Features
* Travis-ci automation
* Constantly updating list that can be automatically rerun and extended
* Automated benchmark report generation

## Flow
1. Make Merge Request to Master
2. Travis will build it and run the tests and report back the results in the results file
3. Files will be accepted?


## TODO

- [X] build.sbt
- [X] Base Classes
- [X] Test Files
- [ ] Travis Integration
- [ ] Improve tests to better test libraries
- [ ] Find New Json Files (Small, Medium, Large)
- [ ] Replace ScalaTest for running tests with ScalaMeter
- [ ] Unit Tests to ensure correct serialization/deserialization
 
### IDEA
Use the github api from sbt to report out the results to regenerate a github pages based report :poop: 
package com.bsamaripa

import org.scalatest.{WordSpec, Matchers}

trait ParserSpec extends WordSpec with Matchers {
  def parser: Parser

  parser.parse(smallJson).shouldEqual(smallJson)
  parser.parse(largeJson).shouldEqual(largeJson)

//  def go(): Unit =
//    for (_ <- 1 to 1000) {
//      parser.parse(largeJson)
//    }
//
//  parser.Name should { //{1
//    "parse it 1,000 times (01)" in {
//      go()
//    }
//  }
}
package com.bsamaripa

import org.scalatest.{WordSpec, Matchers}

trait ParserSpec extends WordSpec with Matchers {
  def parser: Parser

  def go(): Unit =
    for (_ <- 1 to 1000) {
      parser.parse
    }

  parser.Name should { //{1
    "parse it 1,000 times (01)" in {
      go()
    }
  }
}
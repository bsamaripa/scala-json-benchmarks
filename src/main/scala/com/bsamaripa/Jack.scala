package com.bsamaripa

import co.blocke.scalajack._

object Jack extends Parser {
  def parse(json: String): Person = {
    val sj = ScalaJack()
    val js = sj.render[String](json)
    sj.read[Person](js)
  }
}

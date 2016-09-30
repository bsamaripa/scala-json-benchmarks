package com.bsamaripa

import co.blocke.scalajack._

object Jack extends Parser {

  val sj = ScalaJack()

  val js = sj.render[String](json)

  def parse: String = sj.render[String](js)
}

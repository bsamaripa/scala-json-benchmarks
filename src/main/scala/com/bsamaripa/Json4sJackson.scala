package com.bsamaripa

import org.json4s._
import org.json4s.jackson.JsonMethods.{parse => Parse}

object Json4sJackson extends Parser {
  implicit val formats = DefaultFormats
  def parse(json: String): Person = Parse(json).extract[Person]
}

package com.bsamaripa

import org.json4s._
import org.json4s.native.JsonMethods.{parse => Parse}

object Json4sNative extends Parser {
  implicit val formats = DefaultFormats
  def parse(json: String): Person = Parse(json).extract[Person]
}

package com.bsamaripa

import spray.json._

object SprayJson extends Parser {
  def parse: String = json.parseJson.toString
}

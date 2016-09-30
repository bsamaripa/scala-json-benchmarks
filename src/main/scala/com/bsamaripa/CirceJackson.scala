package com.bsamaripa

import io.circe._
import io.circe.jackson

object CirceJackson extends Parser {
  def parse: String = jackson.parse(json).getOrElse(Json.Null).asString.getOrElse("")
}

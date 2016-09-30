package com.bsamaripa

import io.circe.Json
import io.circe.parser.{parse => Parse}

object CirceJawn extends Parser {
  def parse: String = Parse(json).getOrElse(Json.Null).asString.getOrElse("")
}

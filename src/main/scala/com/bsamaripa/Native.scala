package com.bsamaripa

import scala.util.parsing.json.JSON

object Native extends Parser {
  def parse: String = JSON.parseFull(json).getOrElse("").toString
}

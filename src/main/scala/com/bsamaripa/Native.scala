package com.bsamaripa

import scala.util.parsing.json.JSON

object Native extends Parser {
  def parse(json: String): String = JSON.parseFull(json).getOrElse("").toString
}

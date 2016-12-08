package com.bsamaripa

import upickle.default._

object uPickle extends Parser {
  def parse(json: String): String = writeJs(json).toString
}

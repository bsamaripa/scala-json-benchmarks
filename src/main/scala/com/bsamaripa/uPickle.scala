package com.bsamaripa

import upickle.default._

object uPickle extends Parser {
  def parse: String = writeJs(json).toString
}

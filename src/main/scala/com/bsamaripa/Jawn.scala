package com.bsamaripa

import jawn.ast.JParser

object Jawn extends Parser {
  def parse: String = JParser.parseFromString(json).getOrElse("").toString
}

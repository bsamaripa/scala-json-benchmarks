package com.bsamaripa

import org.json4s._
import org.json4s.jackson.JsonMethods.{compact, render, parse => Parse}

object Json4sJackson extends Parser {
  def parse: String = compact(render(Parse(json)))
}

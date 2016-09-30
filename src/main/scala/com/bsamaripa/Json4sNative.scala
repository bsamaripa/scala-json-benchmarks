package com.bsamaripa

import org.json4s._
import org.json4s.native.JsonMethods.{compact, render, parse => Parse}

object Json4sNative extends Parser {
  def parse: String = compact(render(Parse(json)))
}

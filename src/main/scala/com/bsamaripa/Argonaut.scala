package com.bsamaripa
import argonaut._

object Argonaut extends Parser {
  def parse: String = Parse.parseOption(json).get.nospaces
}

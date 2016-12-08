package com.bsamaripa

import scala.pickling.Defaults._
import scala.pickling.{json => JSON}
import JSON._

object Pickling extends Parser {
  def parse(json: String): String = json.pickle.value
}

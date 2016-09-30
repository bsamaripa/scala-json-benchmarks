package com.bsamaripa

import scala.pickling.Defaults._
import scala.pickling.{json => JSON}
import JSON._

object Pickling extends Parser {
  def parse: String = json.pickle.value
}

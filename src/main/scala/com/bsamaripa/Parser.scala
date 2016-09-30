package com.bsamaripa

trait Parser {
  val Name: String = this.getClass.getSimpleName.stripSuffix("$")

  def parse: String
}

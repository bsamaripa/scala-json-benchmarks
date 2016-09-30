package com.bsamaripa

import play.api.libs.json.Json

object PlayJson extends Parser {
  def parse: String = Json.stringify(Json.parse(json))
}

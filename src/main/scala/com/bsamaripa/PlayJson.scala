package com.bsamaripa

import play.api.libs.json.Json

object PlayJson extends Parser {
  def parse(json: String): String = Json.stringify(Json.parse(json))
}

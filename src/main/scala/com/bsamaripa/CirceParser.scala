package com.bsamaripa

import io.circe._
import io.circe.generic.semiauto._

trait CirceParser extends Parser {
  implicit val PersonDecoder: Decoder[Person] = deriveDecoder
  implicit val PersonEncoder: Encoder[Person] = deriveEncoder

  implicit val AddressDecoder: Decoder[Address] = deriveDecoder
  implicit val AddressEncoder: Encoder[Address] = deriveEncoder

  implicit val PhoneDecoder: Decoder[Phone] = deriveDecoder
  implicit val PhoneEncoder: Encoder[Phone] = deriveEncoder
}

object CirceJackson extends CirceParser {
//  def parse(json: String): String = jackson.parse(json).getOrElse(Json.Null).asString.getOrElse("")
  def parse(json: String): Person = jackson.decode[Person](json).getOrElse(???)
}

object CirceJawn extends CirceParser {
  //  def parse(json: String): String = Parse(json).getOrElse(Json.Null).asString.getOrElse("")
  def parse(json: String): Person = jackson.decode[Person](json).getOrElse(???)
}

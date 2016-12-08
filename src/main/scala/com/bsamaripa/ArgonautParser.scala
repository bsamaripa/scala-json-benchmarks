package com.bsamaripa

import scalaz._
import Scalaz._
import argonaut._
import Argonaut._

object ArgonautParser extends Parser {

  implicit def PersonCodecJson: CodecJson[Person] =
    casecodec5(Person.apply, Person.unapply)("firstName", "lastName", "age", "address", "phoneNumber")

  implicit def AddressCodecJson: CodecJson[Address] =
    casecodec4(Address.apply, Address.unapply)("streetAddress", "city", "State", "postalCode")

  implicit def PhoneCodecJson: CodecJson[Phone] =
    casecodec2(Phone.apply, Phone.unapply)("phoneType", "number")

//  def parse(json: String): String = Parse.parseOption(json).get.nospaces

  def parse(json: String): Person = json.decodeOption[Person].get
}

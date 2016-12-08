package com.bsamaripa

trait Parser {
  val Name: String = this.getClass.getSimpleName.stripSuffix("$")

  case class Person(firstName: String, lastName: String, age: Int, address: Address, phoneNumber: Phone)
  case class Address(streetAddress: String, city: String, State: String, postalCode: String)
  case class Phone(phoneType: String, number: String)


  def parse(json: String): Person
}

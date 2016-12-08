package com.bsamaripa

import org.scalameter.api._

class ScalaMeterExample extends Bench.LocalTime {

  val sizes: Gen[Int] = Gen.range("size")(300000, 1500000, 300000)

  val ranges: Gen[Range] = for {
    size <- sizes
  } yield 0 until size

  performance of "Range" in {
    measure method "map" in {
      using (ranges) in {
        r => r.map(_ + 1)
      }
    }
  }
}

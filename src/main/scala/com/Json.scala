package com

import scala.io.Source

package object bsamaripa {
  lazy val smallJson = Source.fromInputStream(getClass.getResourceAsStream("/small.json")).getLines().mkString("\n")
  lazy val largeJson = Source.fromInputStream(getClass.getResourceAsStream("/large.json")).getLines().mkString("\n")
}

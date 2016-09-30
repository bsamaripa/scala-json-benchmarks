package com

import scala.io.Source

package object bsamaripa {
  lazy val json = Source.fromInputStream(getClass.getResourceAsStream("/test.json")).getLines().mkString("\n")
}

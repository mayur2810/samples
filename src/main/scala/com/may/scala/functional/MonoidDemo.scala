package com.may.scala.functional

import cats.Monoid
import cats.implicits._

object MonoidDemo {
  def main(args: Array[String]): Unit = {
    val intList = List(1, 2, 3, 4, 5)
    val strList = List("abc", "xyx")
    val complexMapList = List(Map(1 -> ("abc", 121212l), 2 -> ("xyz", 121212l)), Map(1 -> ("abc", 100000l)))

    println(Monoid[Int].combineAll(intList))
    println(Monoid[String].combineAll(strList))
    println(Monoid[Map[Int, (String, Long)]].combineAll(complexMapList))
  }
}

package com.may.scala.functional

import cats.Functor
import cats.implicits._

object FunctorDemo {

  def main(args: Array[String]): Unit = {

    val intList: List[Int] = List(1, 2, 3, 4)
    println(intList.map(_.toString))
    val listToOption =    Functor[List].lift( (x: Int) => Option(x)) // equivalent to :- (x: List[Int]) => x.map(Option(_))
    listToOption(intList).map(_.map(_ + 20)).foreach(print(_))
    println("")
    // Without expanding maps
    Functor[List].compose[Option].map(listToOption(intList))(_ + 20).foreach(print(_))
  }

}

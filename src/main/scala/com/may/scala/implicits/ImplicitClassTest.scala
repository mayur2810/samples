package com.may.scala.implicits

import com.may.scala.implicits.CarUtils.BrakeFunctions

/**
 * In Java, we would typically extends the class and more functionality
 * Scala provided implicit class which can add functionality to classes as if they are added to same class
 */
object ImplicitClassTest {

  def main(args: Array[String]): Unit = {

    val carWithNoBrakes = new Car("Nyano")
    println(carWithNoBrakes.accelerate)
    println(carWithNoBrakes.stop())
  }
}
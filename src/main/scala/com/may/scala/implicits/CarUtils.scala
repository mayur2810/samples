package com.may.scala.implicits

/**
 * implicit
 */
object CarUtils {

  implicit class BrakeFunctions(car: Car) {
    def stop() = "Stopping"
  }

}
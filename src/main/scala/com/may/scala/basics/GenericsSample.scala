package com.may.scala.basics

import collection.mutable
object GenericsSample {
  def main(args: Array[String]): Unit = {
    // http://blog.kamkor.me/Covariance-And-Contravariance-In-Scala/
    // https://github.com/kamkor/covariance-and-contravariance-examples


    val a: mutable.MutableList[_ <: Number] = mutable.MutableList()
    val b: List[_ <: Number] = List()

    // val newA: mutable.MutableList[_ <: Number] = a.+=(new Integer(3))
    // The above issue is only caused when use-site variance is used

    /*
       Immutable datastructure do not follow the wildcard covariance rule?
       :+ is call site contravariant, meaning it can be safely used to put Number or Any instances?
     */
    val newB: List[_ <: Number] = b :+ new Integer(3)

    println(newB)
  }
}

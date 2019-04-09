package com.may.scala.concurrent

import scala.concurrent.{Await, ExecutionContext, Future}
import ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success}

object FuturesDemo {

  def main(args: Array[String]): Unit = {
    val intList = Seq(1, 2, 3, 4, 5, 6, 7, 8)
    println(Runtime.getRuntime.availableProcessors())
    val futureList = Future.traverse(intList)(i => Future(i * i)).map(seq => seq.map(i => i + i))
    futureList.onComplete {
      /* call back */
      case Success(value) => println(value.mkString(", "))
      case Failure(exception) => println(exception)
    }
    Await.result(futureList, Duration("60 seconds"))
    // Another way to parallelize operations on list
    println(intList.par.map(i => i * i).map(i => i + i).mkString(", "))
  }
}

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
    // Operations on future
    val futureList1 = futureList.flatMap(i => Future(i.map(p => p / p)))

    // Alternative for comprehension
    val result = for {
      i <- futureList
      j <- Future(i.map(p => p / p))
    } yield j

    println(Await.result(futureList, Duration("60 seconds")))
    println(Await.result(futureList1, Duration("60 seconds")))
    println(Await.result(result, Duration("60 seconds")))
    // Another way to parallelize operations on list
    println(intList.par.map(i => i * i).map(i => i + i).mkString(", "))
  }
}

package com.may.scala.basics

object ScalaFunctions {

  /**
   * Function as Method of a class
   */
  def sumMethod(a: Int, b: Int, c: Int): Int = {
    a + b + c
  }

  /**
   * Same as sumMethod method but concise, return type is inferred
   */
  def sumMethod1(a: Int, b: Int, c: Int) = a + b + c

  /**
   * Functions expressed as function literal (as a variable),
   * which can be passed around to other function
   */
  val sumFuncLiteral = (a: Int, b: Int, c: Int) => a + b + c
  val substractFuncLiteral = (a: Int, b: Int, c: Int) => a - b - c

  /**
   * Takes is any function that operates on three ints
   */
  def doMath(a: Int, b: Int, c: Int, anyFunctionThatOperatesOn3Ints: (Int, Int, Int) => Int) =
    anyFunctionThatOperatesOn3Ints(a, b, c)

  /**
   * Function literal that takes other func as parameter
   */
  val doMathLiteral = (a: Int, b: Int, c: Int, anyFunctionThatOperatesOn3Ints: (Int, Int, Int) => Int) =>
    anyFunctionThatOperatesOn3Ints(a, b, c)

  /**
   * Partially applied functions (literals)
   * Useful for creating sub-functions with some parameters applied or even all can be applied later
   *
   */
  def partialSumFunc = sumMethod(10, 10, _: Int)
  val partialSumFunc1 = sumFuncLiteral(10, 10, _: Int)
  val partialSubstractFunc1 = substractFuncLiteral(_, _, _)

  def main(args: Array[String]): Unit = {
    // call method
    print("Method Call: ")
    println(sumMethod(10, 20, 30))

    //call function literal
    println("Literal Call: ")
    println(sumFuncLiteral(10, 20, 30))
    println(substractFuncLiteral(10, 20, 30))

    //Pass function literals to other functions or literals
    println("Function passing: ")
    println(doMath(10, 20, 30, sumFuncLiteral))
    println(doMath(10, 20, 30, substractFuncLiteral))
    println(doMathLiteral(10, 20, 30, sumFuncLiteral))
    println(doMathLiteral(10, 20, 30, substractFuncLiteral))

    //partial function called
    println("Partial Function calls: ")
    println(partialSumFunc(10))
    println(partialSumFunc1(10))
    println(partialSubstractFunc1(50, 10, 10))

    /**
     * Closures
     */
    println("Closures: ")
    var variable = 10
    //Function literal accessing closure
    val funcLiteralAccessingClosure = (x: Int) => x + variable
    println(funcLiteralAccessingClosure(1))

    //change closure variable
    variable = 1000
    println(funcLiteralAccessingClosure(1))

  }

}
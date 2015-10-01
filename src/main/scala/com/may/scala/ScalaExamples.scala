package com.may.scala

object ScalaExamples {

  /**
   * Keyword: type
   * Can be used to shorten the attribute type information, if used at multiple places
   * If used in a trait, the subclass can assign any type as desired
   */
  type MyLargeMapParameterType = Map[String, Map[Int, Map[String, String]]]
  def processMap(myMap: MyLargeMapParameterType) {}
  
  type MyFunctionParameterType = (String, Int, (Long, Byte)) => Map[Int, String]
  def processFunction(myFunc: MyFunctionParameterType) {}

  /**
   * Var Args in Scala
   */
  private def makeMap(x: (Int, String)*) = List(x:_*)
  
  
  def main(args: Array[String]): Unit = {
    
    //Check Var args
     val map =  makeMap((1,"1"), (2,"2"), (3,"3") ,(4,"4"))
     println(map)
  }
}
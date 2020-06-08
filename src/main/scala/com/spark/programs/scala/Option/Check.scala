package com.spark.programs.scala.Option

object Check {
def main(args:Array[String]): Unit ={
  val some:Option[Int]=Some(15)
  val none:Option[Int]=None
  val x=some.isEmpty
  val y=none.isEmpty
  println(s" some:$x  \n  none:$y")
}
}

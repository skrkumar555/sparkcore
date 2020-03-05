package com.spark.programs.scala.PatternMatching

object PM1 {
  def main(args:Array[String]): Unit = {
    println("Output is:" +test(4))
  }
    def test(x:Int):String = x match {
      case 0=> "hello welcome to scala"
      case 1=> "Are you learning Scala?"
      case _=> "Good Luck!"

    }
}

package com.spark.programs.scala.Core
import scala.annotation.tailrec

class Recurssion {
  @tailrec
  final def fact(n: Int, acc: Long = 1): Long = {
    if (n < 1) acc else fact(n - 1, n * acc)
  }
}
object Basics {

  def main(args:Array[String])= {
    val recu=new Recurssion
    println(recu.fact(5))
    println(recu.fact(10))
  }
  }
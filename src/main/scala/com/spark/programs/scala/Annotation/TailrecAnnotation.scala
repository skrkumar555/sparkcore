package com.spark.programs.scala.Annotation

import scala.annotation.tailrec

class TailrecAnnotation {
  @tailrec
  final def fact(n: Int, acc: Long = 1): Long = {if (n < 1) acc else fact(n - 1, n * acc)}
}
object recursion {

  def main(args:Array[String])= {
    val recur=new TailrecAnnotation
    println(recur.fact(5))
    println(recur.fact(10))
  }
  }
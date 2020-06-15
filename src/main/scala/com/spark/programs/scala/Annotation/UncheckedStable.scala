package com.spark.programs.scala.Annotation

import scala.deprecated


object UncheckedStable {

  // Main method
  def main(args: Array[String])
  {
    trait A
    {
      type T = Int
    }
    trait B
    {
      type T <: String
    }
    def f(b: B)(t: b.T) = t.length

    // Define Compiler Annotations
    @annotation.unchecked.uncheckedStable val x: A with B = null

    // legal because x is A
    val y: x.T = 0

    f(x)(y)
  }

}

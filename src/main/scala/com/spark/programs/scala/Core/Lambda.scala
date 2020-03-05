package com.spark.programs.scala.Core

object Lambda {

  def main(args:Array[String]): Unit ={
    val l=(115137,1.6,"SureshKumar")
    val square =(x:Double) =>x*x
    println("Square Value is:" +square(3))
    val squares:Double=>Double=x=>x*x
    println("Squares Value is:" +squares(5))
    val twice:Double=>Double=_*2;
    println("twice" +twice(7))
    val lessthan:(Double,Double)=>Boolean=_<_

    println("EmplId:" +l._1)
    println("Rating:" +l._2)
    println("Name:" +l._3)
    println(s"Employee ${l._3} of ID ${l._1} is given ${l._2} rating")
  }

}

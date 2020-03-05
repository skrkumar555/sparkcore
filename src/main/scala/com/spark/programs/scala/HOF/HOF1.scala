package com.spark.programs.scala.HOF

object HOF1 {
  def main(args:Array[String]): Unit ={
     val a:Array[Int]=Array(1,2,3,4,5)
    a.foreach(println)
   val b= a.map(i=>i*2)
    b.foreach(println)
    val c= a.exists(_<5)
    println(c)
    val d =a.find(_%2==0)
    println(d)
    val e=a.partition(_<3)
    println(e)
    val f=Array("this","is","a","test")
    f.minBy(_.length)
    println(f)
  }

}

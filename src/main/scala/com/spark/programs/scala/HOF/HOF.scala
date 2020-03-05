package com.spark.programs.scala.HOF

object HOF {


  def math(x:Double,y:Double,z:Double,f:(Double,Double)=>Double): Double =f(f(x,y),z);

  def  main (args:Array[String]): Unit ={


    val result =math(50,20,10,(x,y)=>x max y)
    println("result:" +result)
  }
}

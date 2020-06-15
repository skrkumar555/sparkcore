package com.spark.programs.scala.Annotation
import scala.specialized
class SpecializedDemo {

  def invokeReduce[@specialized T](x:Array[T],fn:(T,T) => T)=
    x reduceLeft{fn(_,_)}
}

object SpecializedMain {
  def main(args:Array[String])={
    val sd =new SpecializedDemo
       println(sd.invokeReduce(Array(1,2,3,4,5),(x:Int,y:Int)=>x+y))
      println(sd.invokeReduce(Array(1.0,2.0,3.0,4.0,5.0),(x:Double,y:Double)=>x*y))
  }
}

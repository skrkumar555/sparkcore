package com.spark.programs.scala.Advanced

class V2D(val x:Double,val y:Double){
  def plus(v:V2D) =new V2D(x+x,y+y)
  def minus(v:V2D) =new V2D(x-x,y-y)
  def scale(c:Double)= new V2D(x*c,y*c)
  def magnitude= math.sqrt(x*x+y*y)
  def apply(Index:Int):Double=Index match {
    case 0=> x
    case 1 => y
    case _=>throw new IndexOutOfBoundsException(s"2D vector Indexed at $Index")

  }
}

object V2D {
  def main(args:Array[String]): Unit ={
    val v1 =new V2D(1,2)
    val v2=new V2D(2,2)
    val v3 =v1.plus(v2)
    println(v3.magnitude)


  }
}
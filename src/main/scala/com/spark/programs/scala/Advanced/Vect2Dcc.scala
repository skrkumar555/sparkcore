package com.spark.programs.scala.Advanced

case class Vect2Dcc(val x:Double,val y:Double) {
  def plus(v:Vect2Dcc) =new Vect2Dcc(x+x,y+y)
  def minus(v:Vect2Dcc) =new Vect2Dcc(x-x,y-y)
  def scale(c:Double)= new Vect2Dcc(x*c,y*c)
  def magnitude= math.sqrt(x*x+y*y)
  def apply(Index:Int):Double=Index match {
    case 0=> x
    case 1 => y
    case _=>throw new IndexOutOfBoundsException(s"2D vector Indexed at $Index")

  }
}

object Vect2Dcc {
  def main(args:Array[String]): Unit ={
    val v1 =new Vect2Dcc(1,2)
    val v2=new Vect2Dcc(2,2)
    val v3 =v1.plus(v2)
    println(v3.magnitude)
    println(v3)
   val v4= v3.copy(y=99)
    println(v4)


  }
}

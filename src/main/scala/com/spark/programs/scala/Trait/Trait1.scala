package com.spark.programs.scala.Trait

trait Trait1 {
  def add(x:Int,y:Int)

  def sub(x:Int,y:Int)

  def mul(x:Int,y:Int): Unit =
  {
    val m=x*y
    println("Multiplication is:" +m)
  }
}
trait Trait2{
  def DIV(): Unit ={
    println("Division is:")
  }
}
  class Maths extends Trait1 with Trait2{
    def add(x:Int,y:Int): Unit =
    {
      val e=x+y
      println("addition is:"+e)
    }
    def sub(x:Int,y:Int): Unit =
    {
      val r=x-y
      println("subtraction is:" +r)
    }

   /* def mul(x:Int,y:Int): Unit =
    {
      val m=x*y
      println("Multiplication is:" +m)
    } */

    override def DIV(): Unit = {
      println("division in class is:")
    }

}
object t1{
  def main(args: Array[String]): Unit = {
    val obj=new Maths()
    obj.add(3,1)
    obj.sub(10,5)
    obj.mul(25,5)
    obj.DIV()
  }
}

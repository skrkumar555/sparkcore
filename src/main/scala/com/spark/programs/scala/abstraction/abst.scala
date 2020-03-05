package com.spark.programs.scala.abstraction

abstract class abst {
  def add()

  def sub(): Unit = {
    println("sub is:")
  }
}
abstract class abst1{
  def div(): Unit =
  {
    println("div is:")
  }
}
  class A1 extends abst {
    def add(): Unit =
    {
      println("Addition is:")
    }
    def div(): Unit ={
      println("division is:")
    }

  }
object R1{
  def main(args: Array[String]): Unit = {
    val obj =new A1()
    obj.add()
    obj.sub()
    obj.div()
  }
}




package com.spark.programs.scala.Core

object SOV
{
  class rect {

    def mult(s1:Int,s2:Int): Unit =
    {
      val s3=s1*s2
      println("result is:" +s3)
    }

  }
  def main(args:Array[String]): Unit =
  {
    val su =new rect()
    su.mult(5,3)
  }

}

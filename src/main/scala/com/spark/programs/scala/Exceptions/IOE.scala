package com.spark.programs.scala.Exceptions

import java.io.{FileNotFoundException, IOException}

object IOE {

  def main(args:Array[String]): Unit ={
    try {
      val n=5/5
      println("value is:" +n)
    }
    catch
      {
        case i: IOException=>
          {
            println("IOException occured")
            i.printStackTrace()
          }
        case a : FileNotFoundException=>
          {
            println("FileNotFound Exception occured")
          }
        case e: ArithmeticException=>
        {
          println("ArithmeticException occured")
          e.printStackTrace()
        }
      }
    finally {
      println("Finally executed")

    }
  }

}

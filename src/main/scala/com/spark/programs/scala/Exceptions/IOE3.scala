package com.spark.programs.scala.Exceptions

object IOE3 {
  def main (args:Array[String]): Unit = {
    def ParseInt(s:String): Option[Int] ={
      try {
        Some(s.toInt)
      }
      catch {
        case e : NumberFormatException => None
      }


    }
    val x=ParseInt("Hello")
    println("value is:" +x)

  }

}

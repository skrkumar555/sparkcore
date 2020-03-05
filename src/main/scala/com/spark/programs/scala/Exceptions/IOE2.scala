package com.spark.programs.scala.Exceptions

import java.io._

object IOE2 {

  def main (args:Array[String]): Unit ={

    def ParseInt(s:String):Unit =try {
      s.toInt

    }
    catch {
      case e : NumberFormatException =>
        //println(e)
        e.printStackTrace()


    }
   val y=ParseInt("Hello")
    //println( "value is:" +y)
    }

}

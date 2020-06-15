package com.spark.programs.scala.Core

import scala.sys.process._
import scala.io.Source

object Trailer {

  def main(args:Array[String])={

    def process(line:String):Unit= {
      print("Just Read the line :")
      println(line)
    }
      val file ="data.txt"
      val tail = Seq("tail", "-F",file)
      val output=tail.lineStream.foreach(process)
    println("output is:" +output)




    }


}

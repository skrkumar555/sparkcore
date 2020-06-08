package com.spark.programs.scala.Core

import java.io.RandomAccessFile
import scala.io.Source

object Read{

      def main(args: Array[String]){
        println("start")
        val input = Source.fromFile("src/main/resources/India.csv")
        //input.getLines().drop(1).foreach(println)//This is for removing Header alone

        val lines = input.getLines().toList
        val required_data1 = lines.slice(1,lines.size-1).take(1)
        println("data:"+ required_data1)
        val required_data = lines.slice(1,lines.size-1).mkString("\n")


        import java.io._
        val pw = new PrintWriter(new File("output/tail.txt"))
        pw.write(required_data)
        pw.close()
        println("end")
      }
    }








package com.spark.programs.scala.Core
import java.io.PrintWriter

import scala.io.Source
object TextFile {

  def main(args: Array[String]): Unit = {
    val source=Source.fromFile("data.txt")
    println(source)
    val lines=source.getLines()
    val matrix =lines.map(lines =>lines.split(" ").map(_.toDouble)).toArray
    source.close()
    val pw =new PrintWriter("Output.txt")
    matrix.foreach(row =>pw.println(row.sum))
    pw.close()
  }

}

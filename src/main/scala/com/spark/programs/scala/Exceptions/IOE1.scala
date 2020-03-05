package com.spark.programs.scala.Exceptions

import java.io.{FileInputStream, FileNotFoundException}

object IOE1 {

  def main(args: Array[String]): Unit = {
    try {
      val fis = new FileInputStream("word.txt")
      try{
        val doc=fis.read()
      println("doc output is:" +doc)
    }
    catch {
      case e :FileNotFoundException=>
        {
          println("FileNotFoundException error occured")
          e.printStackTrace()
      }
    }
    finally {
      fis.close()
      println("finally executed")
    }
    }
  }
}

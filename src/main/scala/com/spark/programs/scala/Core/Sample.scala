package com.spark.programs.scala.Core

import java.text.SimpleDateFormat
import java.util.Calendar

object Sample {
  def main(args: Array[String])
  {
   val args="Scala"
    val date = new SimpleDateFormat("dd-MM-yyyy")
    println(date.format(Calendar.getInstance().getTime()))
    val hour=new SimpleDateFormat("dd-MM-yyyy hh-mm-ss")
    println(hour.format(Calendar.getInstance().getTime()))


    // You pass any thing at runtime
    // that will be print on the console
    for(arg<-args)
    {
      println(arg);
    }
  }

}

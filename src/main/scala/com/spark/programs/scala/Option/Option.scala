package com.spark.programs.scala.Option

object Option {
  def main(args:Array[String]): Unit ={
    val name = Map("Suresh" -> "Hadoop", "RajKoti" -> "PHD")
    val x= name.get("Suresh")
    val y=name.get("RajKoti")
    val z=name.get("NoBoday")
    println(s"Suresh is $x Developer")
    println(s"Rajkoti is $y Professsor")

  }

}

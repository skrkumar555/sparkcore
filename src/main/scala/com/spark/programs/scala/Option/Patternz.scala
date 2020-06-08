package com.spark.programs.scala.Option

object Patternz {
  def main(args:Array[String]): Unit ={
    val names =Map("SureshKumar" ->"Hadoop_Developer","Rajakoti" ->"PHD_Professor")
    println(pattern(names.get("SureshKumar")))
    println(pattern(names.get("Rajakoti")))
    println(pattern(names.get("Dhanu")))
  }

  def pattern (z:Option[String]):String ={
    z match {
      case Some(s) =>s
      case None => ("key not Found")
    }

  }

}

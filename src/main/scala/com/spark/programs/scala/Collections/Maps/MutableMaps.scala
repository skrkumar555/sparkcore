package com.spark.programs.scala.Collections.Maps
import scala.collection.mutable._

object MutableMaps {

  def main(args:Array[String])={
    val dataset= Map("suresh" ->70000,
      "Ramesh"->50000,
      "Dhanu" ->45000)
    val suresh=if (dataset.contains("suresh")) dataset("suresh") else 0 ;println("suresh sal is:" +suresh)
    val ramesh=if(dataset.contains("Ramesh")) dataset("Ramesh") else 0 ;println("ramesh sal is:" +ramesh)
    val ramu=  if(dataset.contains("ramu")) dataset("ramu" )else 0 ; println("raju sal is:" +ramu)

    dataset("Ramesh")=65000;println("data set val is:" +dataset)

  }



}

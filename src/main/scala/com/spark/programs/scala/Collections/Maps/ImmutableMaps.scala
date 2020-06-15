package com.spark.programs.scala.Collections.Maps

object ImmutableMaps {

  def main(args:Array[String])={
    val data= Map("suresh" ->50000,
                  "Ramesh"->30000,
                   "Dhanu" ->40000)
    val suresh=if (data.contains("suresh")) data("suresh") else 0 ;println("suresh sal is:" +suresh)
    val ramesh=if(data.contains("Ramesh")) data("Ramesh") else 0 ;println("ramesh sal is:" +ramesh)
    val raju=  if(data.contains("raju")) data("raju" )else 0 ; println("raju sal is:" +raju)

    //data("Ramesh")=50000
  }


}

package com.spark.programs.scala.Extractors

object UNA {

  def main(args:Array[String]): Unit ={
    def apply(firstname:String,lastname:String):String= {

      firstname + "kumar" + lastname
    }

    def unapply(x:String): Option[(String,String)] = {

      val y=x.split("kumar")
      if (y.length==2){
        Some(y(0),y(1))
      }
      else
           None
  }
    println("Apply method:"+ apply("suresh","reddy"))
    println("unapply method:" +unapply("sureshkumarreddy"))
  }

}

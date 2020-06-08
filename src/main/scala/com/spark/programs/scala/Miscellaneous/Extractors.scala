package com.spark.programs.scala.Miscellaneous

//Using Extractors with Pattern Matching In Scala

object Extractors {

  def main(args:Array[String]): Unit ={

    println("Apply Method:" +apply("sureshkumar.t" ,"bt.com"))
    println("Unapply Method:" +unapply("sureshkumar.t@bt.com"))



      def apply(name: String, domain: String):String ={
        name +"@"+ domain
      }
    def unapply(str: String):Option[(String,String)]  ={
      val parts =str.split("@")
      if(parts.length==2){
        Some(parts(0),parts(1))
      }
      else {
        None
      }

    }

  }

}

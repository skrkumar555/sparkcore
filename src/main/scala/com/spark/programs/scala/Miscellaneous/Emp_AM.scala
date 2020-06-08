package com.spark.programs.scala.Miscellaneous

//Overriding Accessors and Mutators in Scala

object Employee {
  def main(args: Array[String]): Unit = {


    class Emp_AM(private var _name: String) {

      def name = _name  // accessor

      def name_=(aName: String) {_name = aName}  //mutator

    }
      val e = new Emp_AM("suresh")
      e.name = "suresh kumar"   //setter
      println("name is:"+e.name)   //getter
  }
}
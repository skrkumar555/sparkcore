package com.spark.programs.scala.GetSet

class Employee
  {
    // Class variables
    var Empl_name: String= " "
    var Empl_id: Int= 0
    var Empl_rating= 0
  }

  // Creating object
  object Main
  {
    // Main method
    def main(args: Array[String])
    {
      // Class object
      var obj = new Employee()
      obj.Empl_name= "Suresh"
      obj.Empl_id= 115137
      obj.Empl_rating= 1
      println("Empl_name Name: " + obj.Empl_name)
      println("Empl_id : " + obj.Empl_id)
      println("Empl_rating: " + obj.Empl_rating)

    }
  }


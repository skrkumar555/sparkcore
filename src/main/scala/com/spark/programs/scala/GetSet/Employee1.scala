package com.spark.programs.scala.GetSet

class Employee1 {

  var Empl_id = 0
  var Empl_name = ""
  private var Empl_rating = 0

  def set_empl_rating(x:Int): Unit ={
    Empl_rating=x
  }
}

  object GFC{

    def main (args:Array[String]): Unit ={

      val obj=new Employee1()
      obj.Empl_id=115137
      obj.Empl_name ="sureshkumar"
      obj.set_empl_rating(1)
      println("Empl_id:" +obj.Empl_id)
      println("Empl_name:"+obj.Empl_name)
      println("Empl_rating:" +obj.set_empl_rating(2))

    }
  }



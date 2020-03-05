package com.spark.programs.scala.GetSet

class Employee2 {

  var Empl_id = 0
  var Empl_name = ""
  private var Empl_rating = 0

  def set_empl_rating(x:Int): Unit ={
    Empl_rating=x
  }
  def get_empl_rating: Int ={
    return Empl_rating
  }
}

object GFC1{

  def main (args:Array[String]): Unit ={

    val obj=new Employee2()
    obj.Empl_id=115137
    obj.Empl_name ="sureshkumar"
    obj.set_empl_rating(2)
    println("Empl_id:" +obj.Empl_id)
    println("Empl_name:"+obj.Empl_name)
    println("Empl_rating:" +obj.get_empl_rating)


  }
}

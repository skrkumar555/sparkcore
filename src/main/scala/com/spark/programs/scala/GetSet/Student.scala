package com.spark.programs.scala.GetSet

class Student
{
  // Class variables
  var student_name: String= " "
  var student_age: Int= 0

  // Getter
  private var student_rollno= 0

  // Class method
  def set_rollno(x: Int){
    student_rollno= x
  }
  def get_rollno(): Int ={
    return student_rollno
  }

}

// Creating object
object Stud
{
  // Main method
  def main(args: Array[String])
  {

    // Class object
    var obj = new Student()
    obj.student_name= "Yash"
    obj.student_age= 22
    obj.set_rollno(59)

    // Directly getting the value of variable
    println("Student Name: " + obj.student_name)

    // Directly getting the value of variable
    println("Student Age: " + obj.student_age)

    // Through method calling
    println("Student Rollno: " + obj.get_rollno)
  }
}
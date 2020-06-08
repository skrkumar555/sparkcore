package com.spark.programs.scala.Core

object GradeBook  {

  def main(args:Array[String]): Unit ={
    val students =List(new Student("suresh" ,"kumar"), new Student("kumar","Reddy"))
    for(s <- students) PrintStudent(s)
  }
  def PrintStudent(s:Student):Unit ={
    println(s.firstName + ""+s.lastName)
    println("Grade :" +s.average)
    println("test:" +s.testsres)
  }
}

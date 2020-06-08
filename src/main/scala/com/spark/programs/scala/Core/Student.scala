package com.spark.programs.scala.Core

class Student (
   val firstName:String,
   val lastName:String,
   private var quizzes:List[Int]=Nil,
   private var assignments:List[Int]=Nil,
   private var tests:List[Int]=Nil){

  def quizAverage:Double = if(quizzes.isEmpty) 0.0
  else if (quizzes.length==1)quizzes.head
  else (quizzes.sum-quizzes.min).toDouble /(quizzes.length-1)
  def assignmentAvergae:Double=if(assignments.isEmpty) 0.0
  else assignments.sum.toDouble /assignments.length
  def testsAverage:Double=if(tests.isEmpty) 0.0
  else tests.sum.toDouble /tests.length
def average:Double=quizAverage*0.1+assignmentAvergae *0.5+testsAverage*0.1

  def testsres=tests
}

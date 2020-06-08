package com.spark.programs.scala.Core

class ImmutableStudent (
                         val  firstName:String,
                         val lastName:String,
                         val quizzes:List[Int]=Nil,
                         val assignments:List[Int]=Nil,
                         val tests:List[Int]=Nil){

  def addQuiz(grade:Int):ImmutableStudent= new ImmutableStudent(firstName,lastName,grade ::quizzes,assignments,tests)

  def quizAverage:Double = if(quizzes.isEmpty) 0.0
  else if (quizzes.length==1)quizzes.head
  else (quizzes.sum-quizzes.min).toDouble /(quizzes.length-1)
  def assignmentAvergae:Double=if(assignments.isEmpty) 0.0
  else assignments.sum.toDouble /assignments.length
  def testsAverage:Double=if(tests.isEmpty) 0.0
  else tests.sum.toDouble /tests.length
  def average:Double=quizAverage*0.1+assignmentAvergae *0.5+testsAverage*0.1
}




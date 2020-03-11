package com.spark.programs.scala.Core

object option {
   def main(args:Array[String]): Unit ={
     val a=Array(1,2,3,4,5,6,7)
   a.find(_<3)
   a.find(_>10)
     grade(List(54,55),List(5,4),List(5))
     grade(quizzes =List(54,55),assignments=List(5,4))

     /*a.get
     a match {
       case some: Some(i) => println(s"Found $i")
       case None =>println("Nothing Found")
       }
       a.getorElse(0)
     */
    //val plus3=add(3,_)
     //val e=plus3(5)
     println(threetuple(()=>math.random))
     println((threetup(math.random)))

     def grade(quizzes:List[Int],assignments:List[Int],grade:List[Int]=Nil):Unit={

     }
     def add(x:Int,y:Int):Int=x+y
     def threetuple(a:()=>Double):(Double,Double,Double)={
       (a(),a(),a())

     }
     def threetup(a: =>Double):(Double,Double,Double)={
       (a,a,a)
     }


     }

}

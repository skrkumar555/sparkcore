package com.spark.programs.scala.Core

object Loop {

  def main(args:Array[String]): Unit ={
    var i=0
    while(i<=10){
      println(i)
      i += 1
    }
    val age=15
    if (age<18) {
      println("No Entry")
    }  else {
      println("you are in")

    }
    val result=if(age<18){
      "No Entry"

    }else {
      "You are in"
    }
    println("Result is : " +result)
    println(if (age<18) "No Entry" else "YOU ARE IN")
   val stuff= for {
     i <- 0 until  10
     if i%2==0 || i%3==0
     sqr= i*i
     j <- 'a' to 'd'
   } yield {
     i ->j
   }
println("stuff data is" +stuff)
  }

}

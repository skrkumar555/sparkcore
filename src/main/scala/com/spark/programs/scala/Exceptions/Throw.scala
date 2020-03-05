package com.spark.programs.scala.Exceptions

object Throw {
  // Creating object

    // Define function
    def validate(article:Int)= {

      // Using throw keyword
     try {
      if(article < 20)
       throw new ArithmeticException("You are not eligible for internship:" +article)
      else
        println("You are eligible for internship:" +article)
     }
  catch {
    case e :ArithmeticException=>
      e.printStackTrace()
  }
    }

  // Main method
    def main(args: Array[String])
    {
      validate(2)
    }
  }



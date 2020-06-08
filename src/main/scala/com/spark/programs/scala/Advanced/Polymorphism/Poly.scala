package com.spark.programs.scala.Advanced.Polymorphism

import scala.io.StdIn.readDouble

object Poly {
  def main(args:Array[String]): Unit ={
  }
    def square(x:Double):Double=  x*x

  def sumvalues(i:Int):Double={
    if(i<1) 0.0 else readDouble() + sumvalues(i -1)
  }
  def productValue(i:Double):Double ={
    if(i<1) 1.0 else readDouble() * productValue(i-1)
  }
  def bubblesort(arr:Array[Double]):Unit = {
  for(i <- 0 until arr.length-1; j<- 0 until arr.length-1-i){
    if(arr(j+1) < arr(j)){
      val tmp =arr(j)
      arr(j)=arr(j+1)
      arr(j+1)=tmp
    }
  }
  }
}

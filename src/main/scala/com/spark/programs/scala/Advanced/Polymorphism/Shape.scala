package com.spark.programs.scala.Advanced.Polymorphism

import scalafx.scene.canvas.GraphicsContext
import scalafx.scene.paint.Color



abstract class Shape {
   def area:Double
  def perimeter:Double
  def draw(gc:GraphicsContext): Unit ={

  }
}

object Shape extends App {

    val rect = new Rectangle(4,5,Color.BlueViolet)
    printshapedata(rect)
    val cir=new Circle(5,Color.Aquamarine)
    printshapedata(cir)
    val sqr=new Square(10,Color.DarkMagenta)
    printshapedata(sqr)

  def printshapedata(s:Shape) ={
    println(s"Area = ${s.area}")
    println(s"Perimeter = ${s.perimeter}")
  }
}

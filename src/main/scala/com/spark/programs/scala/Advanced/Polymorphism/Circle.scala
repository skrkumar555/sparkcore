package com.spark.programs.scala.Advanced.Polymorphism

import scalafx.scene.canvas.GraphicsContext
import scalafx.scene.paint.Color


class Circle(val radius:Double, val color:Color) extends Shape with HasColor {
  override def area: Double = math.Pi*radius*radius
  override def perimeter: Double = 2 *math.Pi*radius*radius
  override def draw(gc:GraphicsContext) ={
    super.draw(gc)
    gc.fillOval(0,0,radius,radius)
  }
}

package com.spark.programs.scala.Advanced

class MutableV2D(private  var _x:Double,private  var _y:Double) {
  def x = _x

  def y = _y

  def SetX(newX: Double): Unit = _x = newX

  def SetY(newY: Double): Unit = _y = newY

  def plus(mv: MutableV2D): MutableV2D = {
    _x += mv.x
    _y += mv.y
    this
  }

  def minus(mv: MutableV2D): MutableV2D = {
    _x -= mv.x
    _y -= mv.y
    this
  }

  def scale(c: Double): MutableV2D = {
    _x *= c
    _y *= c
    this
  }

  def magnitude = math.sqrt(x * x + y * y)

  def apply(Index: Int): Double = Index match {
    case 0 => _x
    case 1 => _y
    case _ => throw new IndexOutOfBoundsException(s"2D  Vector Indexed at $Index")
  }

  def update(Index: Int, newValue: Double): Unit = Index match {
    case 0 => _x = newValue
    case 1 => _y = newValue
    case _ => throw new IndexOutOfBoundsException(s"2D Vector updated at $Index")
  }

  object MutableV2D {
    def main(args: Array[String]): Unit = {
      val v1 = new MutableV2D(1, 2)
      val v2 = new MutableV2D(2, 2)
      val v3 = v1.plus(v2)
      println(v3.magnitude)
    }
  }

}

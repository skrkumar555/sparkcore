package com.spark.programs.scala.Miscellaneous

//Using Extractors with Pattern Matching In Scala
import org.apache.calcite.Demo

object Extractors1 {
  def main(args: Array[String]): Unit = {
    val x =Extractors1(5)
    println(x)
    x match {
      case Extractors1(num) =>println(x+ " is bigger than" +num)
      case _=>println("not calculated")
    }
  }

  def apply(x:Int) = x*10

  def unapply(z:Int):Option[Int] =if (z%2 ==0){
    Some(z/2)
  }else {
    None
  }
}
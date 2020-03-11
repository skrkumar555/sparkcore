package com.spark.programs.scala.Collections
import scala.io.StdIn._

object LL {

  def main(args:Array[String]): Unit ={
    val Array(a,b,c)="one two three".split(" ")
    println("Arrays are:" +Array(0))
    val lst =buildList()
    println("ConcatListElements are:" +concatStrings(lst))
    println("ConcatPatternElements are:" +concatStringspat(lst))
  }

  def buildList():List[String] ={
  val input =readLine()
    if (input == "quit") Nil
    else input :: buildList()

  }

  def concatStrings (words:List[String]):String ={
    if (words.isEmpty)" "
    else words.head + concatStrings(words.tail)

  }
  def concatStringspat (words:List[String]):String= words match {
    case Nil => " "
    case h::t =>h+concatStringspat(t)

  }
}

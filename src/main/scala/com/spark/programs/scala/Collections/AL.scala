package com.spark.programs.scala.Collections
import scala.io.StdIn._

object AL {

  def main(args: Array[String]): Unit = {
    val array=Array(1,2,3,4,5,6)
    val array1=array.map (_.toString)
    println("output is:" +array.toList)
    Array.fill(10)(1)
    List.fill(10)(math.random)
   // List.fill(10)(io.StdIn.readList)
    Array.tabulate(10)(i =>i*i)

 val a=Array(1,2,3,4,5,6,7,8,9)
    a.drop(2)
    a.dropRight(3)
    a.head
    a.tail
    a.last
    a.length
    a.length-1
    a.take(2)
    a.takeRight(3)
    a.splitAt(3)
    a.slice(2,5)
    a.patch(3,Array(98,99,100),3)
    a.diff(Array(100,45))
    a.distinct
    a.intersect(List(1,2))
    a.union(Array(1,2,3))
    a.max
    a.min
    a.mkString
    a.mkString(" ,")
   val w= a.zip('a' to 'z')
    a.zipWithIndex
    println("W is:" +w.toArray)

  }

}

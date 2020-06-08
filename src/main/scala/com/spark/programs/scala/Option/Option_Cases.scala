package com.spark.programs.scala.Option

object Option_Cases {

  def main(args:Array[String]): Unit ={
    val some:Option[Int]=Some(50)
    val none:Option[Int]=None
    val A= some.get
    val B=some.productArity
    val C=some.productElement(0)
    val D=some.exists(y => {y%5 ==0})
    val E=some.filter(y=> {y%2 ==0})
    val F=some.filterNot(y=>{y%2!=0})
    val G=some.isDefined
    val H=none.isDefined
    val I=some.iterator
    val J=some.map(y=>{y+y})
    println( s"get Value is: $A,  productArity Value is: $B,  productElement value is: $C, Exist Value is:$D, Filter Value is:$E, Not_Filter Value is:$F, $G,$H,$I,$J")

  }

}

package com.spark.programs.scala.Advanced.Polymorphism

class ToDValues[A] {
  private  val values:Array[Option[A]]=Array.fill(24)(None)

  def apply(hour:Int) = values(hour).get
  def get(hour:Int):Option[A]=values(hour)
  def update(hour:Int,v:A) =values(hour)=Some(v)
  def clear(hour:Int):Unit={
    values(hour)=None
  }
  def combine(o:ToDValues[A],f:(Option[A],Option[A])=>Option[A]):ToDValues[A]={
    val ret =new ToDValues[A]
    for((v, i) <- (values,o.values).zipped.map((v1,v2)=>f(v1,v2)).zipWithIndex){
      ret.values(i)=v
    }
     ret
  }
}

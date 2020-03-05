package com.spark.programs.scala.Core

import scala.collection.immutable

object Match {

  def main(args:Array[String]): Unit = {
    try {
      val a:immutable.IndexedSeq[Any] = for (i <- 1 to 5) yield {
        (i % 3, i % 5) match {
          case (0, 0) => "Both"
          case (0, 1) => "three"
          case (1, 1) => "five"
          case (2, 2) => "Bothsss"



        }
      }
    }
        catch
        {
          case e: scala.MatchError =>println(e)
        }

      }


}

package com.spark.programs.Spark


import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._
object JoinMan {

  def main(args: Array[String]) = {

    val spark=SparkSession.builder().master("local").appName("JoinMan").getOrCreate()
    val sc=spark.sparkContext

    def joinDFs(dfL: DataFrame, dfR: DataFrame, conditions: List[String], joinType: String) = {
      val joinConditions = conditions.map(cond => {
        val arr = cond.split("\\s+")
        if (arr.size != 3) throw new Exception("Invalid join conditions!") else
          arr(1) match {
            case "<" => dfL(arr(0)) < dfR(arr(2))
            case "<=" => dfL(arr(0)) <= dfR(arr(2))
            case "=" => dfL(arr(0)) === dfR(arr(2))
            case ">=" => dfL(arr(0)) >= dfR(arr(2))
            case ">" => dfL(arr(0)) > dfR(arr(2))
            case "!=" => dfL(arr(0)) =!= dfR(arr(2))
            case _ => throw new Exception("Invalid join conditions!")
          }
      }).reduce(_ and _)
      println("joinConditions:" +joinConditions)
      dfL.join(dfR, joinConditions, joinType)
    }
    val dfLeft = Seq(
      (1, "2018-04-01", "p"),
      (1, "2018-04-01", "q"),
      (2, "2018-05-01", "r"))

    val dfLWithSchema=spark.createDataFrame(dfLeft).toDF("id","date","value")

    val dfRight = Seq(
      (1, "2018-04-15", "x"),
      (2, "2018-04-15", "y"))

    val dfRWithSchema=spark.createDataFrame(dfRight).toDF("id","date","value")

    val conditions = List("id = id", "date <= date")

    joinDFs(dfLWithSchema,dfRWithSchema,conditions,"leftouter").show()


  }
}

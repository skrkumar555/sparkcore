package com.spark.programs.Spark

import java.text.SimpleDateFormat
import java.util.Calendar

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.hadoop.mapred.{FileAlreadyExistsException, InvalidInputException}

////

object WordCount {
  val date = new SimpleDateFormat("dd-MM-yyyy")
  val UD=date.format(Calendar.getInstance().getTime())
  val hour=new SimpleDateFormat("dd-MM-yyyy hh-mm-ss")
  val UH=hour.format(Calendar.getInstance().getTime())

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(conf)
    try {
      val input: RDD[String] = sc.textFile("words.txt")
      val words = input.flatMap(lines => lines.split(" "))
      val counts = words.map(word => (word, 1)).reduceByKey(_ + _)
      try {
        counts.saveAsTextFile("/C:/Users/skrku/IdeaProjects/sparkcore/output/"+UD)
        System.out.println("spark program worked")
      }catch {
        case r :FileAlreadyExistsException=>println(r)
          counts.saveAsTextFile("/C:/Users/skrku/IdeaProjects/sparkcore/output/"+UH)
      }
    }
    catch{
      case e :InvalidInputException =>println(e)
    }

  }
}

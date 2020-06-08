package com.spark.programs.Spark

import org.apache.spark.sql.SparkSession

object Json_Collection {

  def main(args:Array[String]): Unit ={

   val spark=SparkSession.builder().master("local").appName("Json_Collection").getOrCreate()
    val sc=spark.sparkContext
    spark.sparkContext.setLogLevel("ERROR")

    val emp_sgl_df=spark.read.json("C:\\Users\\skrku\\IdeaProjects\\sparkcore\\src\\main\\resources\\employees_singleLine.json")
    val emp_mpl_df=spark.read.json("C:\\Users\\skrku\\IdeaProjects\\sparkcore\\src\\main\\resources\\employees_multiLine.json")
   val emp_mpl_dfl=spark.read.option("multiline","true").json("C:\\Users\\skrku\\IdeaProjects\\sparkcore\\src\\main\\resources\\employees_multiLine.json")
   //val df = spark.read.schema(schema).json("C:\\Users\\skrku\\IdeaProjects\\sparkcore\\src\\main\\resources\\employees_multiLine.json").cache()
   //df.filter($"_corrupt_record".isNotNull).count().;
     emp_sgl_df.printSchema()
     emp_mpl_df.printSchema()
    emp_mpl_dfl.printSchema()

   emp_sgl_df.except(emp_mpl_dfl).show()

   println("emp_sgl_df:"+emp_sgl_df.show(100,false))
   // println("emp_mpl_df:" + emp_mpl_df.show(100,false))
   println(("emp_mpl_dfl:" +emp_mpl_dfl.show(100,false)))

  }
}

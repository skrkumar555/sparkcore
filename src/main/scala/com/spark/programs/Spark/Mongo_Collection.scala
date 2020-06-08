package com.spark.programs.Spark

import com.mongodb.spark.MongoSpark
import com.mongodb.spark.config.WriteConfig
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.lit

object Mongo_Collection {

  def main(args: Array[String]) = {
    val spark = SparkSession.builder().master("local").appName("Mongo_Collection").config("spark.mongodb.output.uri","mongodb://localhost:27017/suresh.Employee")
      .getOrCreate()
    val sc = spark.sparkContext
    spark.sparkContext.setLogLevel("ERROR")


    val mongo_db_hostname = "localhost"
    val mongo_port_n0 = "27017"
    val mongo_db_username = "skrkumar"
    val mongo_db_password = "test123"
    var mongo_db_name = "suresh"
    val mongo_Collection_name = "post"
    var mongo_Collection_name1 = "Employee"

    val spark_uri = "mongodb://" + mongo_db_username + ":" + mongo_db_password + "@" + mongo_db_hostname + ":" + mongo_port_n0 + "/" + mongo_db_name + "." + mongo_Collection_name
    println("uri is:" + spark_uri)
    val spark_uri1="mongodb://" +mongo_db_username+":"+ mongo_db_password+ "@"+mongo_db_hostname+ ":"+mongo_port_n0+"/"+mongo_db_name+"."+mongo_Collection_name1
    println("uri1 is:" +spark_uri1)

    val data_df=spark.read.format("mongo").option("uri", spark_uri).option("database",mongo_db_name).option("collection" ,mongo_Collection_name).load()
    val diff_coll_df=spark.read.format("mongo").option("uri",spark_uri).option("database",mongo_db_name).option("collection",mongo_Collection_name1).load()
    data_df.printSchema()
    diff_coll_df.printSchema()
    println("data_df:",data_df.show(100,false))
    println("diff_coll_df",diff_coll_df.show(100,false))
    val final_data=data_df
    println("final_data:" +final_data.show(100,false))
  // final_data.write.format("json").mode("Overwrite").save("C:\\Users\\skrku\\IdeaProjects\\sparkcore\\output\\Mongo\\")
    final_data.write.option("multiline","true").format("json").mode("Overwrite").save("C:\\Users\\skrku\\IdeaProjects\\sparkcore\\output\\Mongo\\")
    val data_gr=diff_coll_df.filter(diff_coll_df.col("Score") < "3.5").withColumn("Grade",lit("B")).withColumn("Inc_Amount",lit(35000))
    println("data_gr:" +data_gr.show(100,false))
    val data_lr=diff_coll_df.filter(diff_coll_df.col("Score") >= "3.5").withColumn("Grade",lit("A")).withColumn("Inc_Amount",lit(55000))
    val final_res_df=data_gr.union(data_lr)
    println("final_res_df:" +final_res_df.show(100,false))
    val writeConfig=WriteConfig(Map("collection"->"Employee","writeConcern.w" ->"majority"),Some(WriteConfig(sc)))
     //MongoSpark.save(final_res_df.write.mode(SaveMode.Overwrite), WriteConfig(mongo_db_name = "suresh", mongo_Collection_name1 ="Employee", connectionString = Some(WriteConfig(sc))))
    MongoSpark.save(final_res_df,writeConfig)



  }
}

package com.spark.programs.S3

import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.auth.BasicAWSCredentials
import java.io.File
import play.api._
import com.amazonaws.regions.Regions
import com.amazonaws.services.s3.AmazonS3
import com.amazonaws.services.s3.AmazonS3ClientBuilder
import com.amazonaws.services.s3.model.Bucket
import com.amazonaws.auth.policy.Action


object AmazonS3FileUpload extends App {



  val bucketName = "sureshskr"
  val fileToUpload = new File("C:\\Users\\skrku\\OneDrive\\Documents\\New folder\\Sureshkumar_hadoop_resume.docx")

  val AWS_ACCESS_KEY = ""
  val AWS_SECRET_KEY = ""

  val yourAWSCredentials = new BasicAWSCredentials(AWS_ACCESS_KEY, AWS_SECRET_KEY)
  val amazonS3Client = new AmazonS3Client(yourAWSCredentials)
  var buckets = amazonS3Client.listBuckets()
  if (amazonS3Client.doesBucketExistV2(bucketName)) {
    amazonS3Client.createBucket(bucketName)
    amazonS3Client.putObject(bucketName, "Suresh_Resume", fileToUpload)

    println("your S3 buckets are:" + buckets)
    val regions = amazonS3Client.getBucketLocation("sparkdemo555")
    println("Bucket Region is:" + regions)



  }
}

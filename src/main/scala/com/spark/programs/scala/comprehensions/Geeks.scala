package com.spark.programs.scala.comprehensions

object Geeks {

  def main(args:Array[String]): Unit ={
    case class Language(name:String,article:Int)
    val languageBase= List(Language("Scala",26),
                             Language("java",35),
                             Language("perl",45),
                            Language("Python",22))


    val MoreThenTwenty=for(languages <- languageBase
      if (languages.article >=20 && languages.article <30)){

    }
  }

}

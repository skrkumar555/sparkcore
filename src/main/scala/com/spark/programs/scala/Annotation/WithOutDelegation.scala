package com.spark.programs.scala.Annotation

trait Dao{
  def getUserList(): Seq[String]
}
trait MangoDao extends Dao {
  def getUserList(): Seq[String] =
    Seq(
      "-suresh",
      "-kumar",
      "-Reddy"
    )
}
trait UserRepository { this:Dao =>
  def printUserInfo():Unit = {
    getUserList().foreach(println)
  }

}
  trait Dashboard { this:UserRepository=>
    def printDashboardHeading():Unit={
      println("Dashboard")
    }
    def printDashboard():Unit={
      printDashboardHeading()
      printUserInfo()
    }
  }

class WithOutDelegation  extends Dashboard with UserRepository with MangoDao { }

object CakeApp extends App{
  val dashboard=new WithOutDelegation
  dashboard.printDashboard()
}

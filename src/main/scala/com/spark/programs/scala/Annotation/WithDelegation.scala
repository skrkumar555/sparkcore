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


class WithDelegation {
  private val impl=new Dashboard
                    with UserRepository
                   with MangoDao
  def printDashboard()=impl.printDashboard()
}

object AppDashboard extends App
{
  val dashboard=new WithDelegation
  dashboard.printDashboard()
}

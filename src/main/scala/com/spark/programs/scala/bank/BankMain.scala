package com.spark.programs.scala.bank
import javax.security.auth.login
import javax.security.auth.login.AccountException

import scala.io.StdIn._

/*object BankMain {
  def main(args: Array[String]): Unit = {
    val bank=new Bank
    var customer:Option[Customer] =None
    var account:Option[Account]=None
    var option = 0
    while (option != 10) {
      println(menu)
      option = readInt()
      option match {
        case 1=>customer=Some(createCustomer(bank))
        case 2=>customer=selectCustomer(bank)
        case 3=>
        case 4=>
        case 5=>
        case 6=>
        case 7=>
        case 8=>
        case 9=>
        case 10=>
        case _=>println("Please select the valid option")



      }
    }
  }
private def createCustomer(bank:Bank):Customer={
  println("What is the Customers FirstName:")
  var firstName=readLine()
  println("What is the Customers LastName:")
  var lastName=readLine()
  println("What is the Customers Address:")
  var Address=readAddress()
  bank.addCustomer(firstName,lastName,Address)
}
  private def selectCustomer(bank: Bank):Option[Customer]={
    println("Do you want to Find customer by Name or ID:")
    var option=readLine()
    if(option=="Name"){
      println("What is the Customers FirstName:")
      var firstName=readLine()
      println("What is the Customers LastName:")
      var lastName=readLine()
      bank.findCustomer(firstName,lastName)
    }else {
      println("What is the Customers FirstName:")
      var firstName=readLine()
      println("What is the Customers ID:")
      var ID=readLine()
      bank.findCustomer(ID)
    }


  }
  private def readAddress():Address= ???
  private val menu ="""select one of the Following  options:
  1.Create Customer
  2.Select Customer
  3.Create Account
  4.Close Account
  5.Select Account
  6.Deposit to Account
  7.With draw from Account
  8.Check Account Balance
  9.Change Address
  10.quit"""
}
*/
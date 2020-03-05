package com.spark.programs.scala.FileChooser

import scala.swing.{Dialog, FileChooser}
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException

object FileChooser1 {

  def main(args: Array[String]): Unit = {
    val chooser = new FileChooser
    if (chooser.showOpenDialog(null) == FileChooser.Result.Approve) {
      val file = chooser.selectedFile
      try {
        val fis = new FileInputStream(file)
        val buf = new Array[Byte](file.length().toInt)
        try {
          fis.read(buf)
          println("output is:" + new String(buf))
        }
        catch {
          case e: IOException =>
            Dialog.showMessage(null, "There was a error while reading file", "Error", Dialog.Message.Error, null)
            e.printStackTrace()
        } finally {
          fis.close()
        }
      }catch
        {
          case r: FileNotFoundException =>
            Dialog.showMessage(null, "There was a error while reading file", "Error", Dialog.Message.Error, null)
            r.printStackTrace()
        }


    }
  }
}
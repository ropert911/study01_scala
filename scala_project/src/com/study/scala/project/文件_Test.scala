package com.study.scala.project

import java.io.PrintWriter
import java.util.Date

import scala.io.Source

/**
  * Created by xq on 2019/3/25.
  */
object 文件_Test {
  def main(args: Array[String]) {
    val out = new PrintWriter("output.txt")
    for (i <- 1 to 5) out.println(i)
    out.close()

    val inputFile = Source.fromFile("output.txt")
    val lines = inputFile.getLines
    for (line <- lines) println(line)
  }
}

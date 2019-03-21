package com.study.scala.mvn.Collection

/**
  * Created by xq on 2019/3/5.
  */
object Tuple_Test {
  //元组和List类型，但不能修改
  def main(arg: Array[String]): Unit = {
    val raoul = ("Raoul", "+ 44 887007007")
    val alan = ("Alan", "+44 883133700")

    //元组大小为 (Int,String,String)
    val book = (2014, "Java 8 in Action", "Manning")
    val numbers = (42, 1337, 0, 3, 14)
    println(book._1)
    println(numbers._4)
  }
}

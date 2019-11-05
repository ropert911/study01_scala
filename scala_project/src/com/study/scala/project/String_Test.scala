package com.study.scala.project

/**
  * Created by xq on 2019/3/25.
  */
object String_Test {
  def main(args: Array[String]): Unit = {
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "Hello, Scala!"
    var fs = printf("Float：" + "%f, integer： %d, Sring %s", floatVar, intVar, stringVar);
    println(fs)

    val name = "James"
    println(s"Hello, $name")
    println(s"1 + 1 = ${1 + 1}") //s插值器：允许使用变量
    val height = 1.9d
    println(f"$name%s is $height%2.2f meters tall") //f插值器：格式化


    val str111 = "3000000500001804^000080029C09E987^97^98^99^20191105143115^5.5^null^null^null^null^null^null^null^null^1000.0^3000.0^1000.0^3008^20191105"
    val params = str111.split('^')
    params.foreach(item =>
      println("aaa:" + item)
    )
    val params2 = str111.split("^")
    params2.foreach(item =>
      println("bbb:" + item)
    )
  }
}

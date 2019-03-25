package com.study.scala.project

import java.util.Date

/**
  * Created by xq on 2019/3/25.
  */
object 函数 {
  def main(args: Array[String]) {
    printStrings("Hello", "Scala", "Python");

    println(apply(layout, 10))

    //匿名函数-声明
    var userDir = () => {
      System.getProperty("user.dir")
    }
    var inc = (x: Int) => x + 1
    var mul = (x: Int, y: Int) => x * y
    var factor = 3
    val multiplier = (i:Int) => i * factor    //闭包：返回值决定于函数之外声明的一个或多个变量
    //匿名函数-使用
    var x = inc(7) - 1
    println(mul(3, 4))
    println(userDir)


    //部分应用函数：使用时只传递部分函数
    val date = new Date
    val logWithDateBound = log(date, _ : String)
    logWithDateBound("message1" )
    logWithDateBound("message2" )
    logWithDateBound("message3" )
  }

  // 可变参数 String *，实际上是Array [String]
  def printStrings(args: String*) = {
    var i: Int = 0;

    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }

  //指定参数默认值
  def addInt(a: Int = 5, b: Int = 7): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }

  //这里函数f:参数int，返回String,
  def apply(f: Int => String, v: Int) = f(v)

  //A 是泛型
  def layout[A](x: A) = "[" + x.toString() + "]"

  //内部函数
  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }

    fact(i, 1)
  }

  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }
}

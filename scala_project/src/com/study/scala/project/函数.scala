package com.study.scala.project

import java.util.Date

/**
  * Created by xq on 2019/3/25.
  */
object 函数 {
  //高阶函数，参数接受函数做参数。 函数f:参数int，返回String,
  def apply(f: Int => String, v: Int) = f(v)

  //A 是泛型
  def layout[A](x: A) = "[" + x.toString() + "]"

  def main(args: Array[String]) {
    //匿名函数
    val myNumFunc1: Int => Int = (num: Int) => num * 2
    println(myNumFunc1(3))
    val myNumFunc2 = (num: Int) => num * 2
    println(myNumFunc2(4))

    //闭包一：直接使用外部变量
    var more = 1
    val addMore = (x: Int) => x + more
    println(addMore(10))
    println(addMore(10))
    //闭包一：使用，只传部分参数
    val log = (date: Date, message: String) => println(date + "----" + message) //也可以是真实的外部函数
    var date = new Date
    val logWithDateBound = log(date, _: String)
    logWithDateBound("message1")

    //闭包二：完整语法定义
    def addMore2(more: Int) = (x: Int) => x + more //闭包的正确语法
    val myFunc = addMore2(4)
    println(myFunc(10))

    //高阶函数的使用
    println(apply(layout, 10))
  }

  //指定参数默认值
  def addInt(a: Int = 5, b: Int = 7): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }

  // 可变参数 String *，实际上是Array [String]
  def printStrings(args: String*) = {
    var i: Int = 0;

    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }


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
}

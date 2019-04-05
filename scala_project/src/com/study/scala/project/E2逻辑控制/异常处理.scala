package com.study.scala.project.E2逻辑控制

/**
  * Created by xq on 2019/4/5.
  */
object 异常处理 {

  class ExceptionExample {
    def divide(a: Int, b: Int) = {
      try {
        a / b
        var arr = Array(1, 2)
        arr(10)
      } catch {
        case e: ArithmeticException => println(e)
        case ex: Exception => println(ex)
        case th: Throwable => println("found a unknown exception" + th)
      }
      finally {
        println("Finaly block always executes")
      }

      println("Rest of the code is executing...")
    }

    //抛出异常
    def validate(age: Int) = {
      if (age < 18)
        throw new ArithmeticException("You are not eligible")
      else println("You are eligible")
    }

    //throws关键字来声明异常。可以使用方法定义声明异常, 它向调用者函数提供了此方法可能引发此异常的信息。
    // 它有助于调用函数处理并将该代码包含在try-catch块中，以避免程序异常终止
    @throws(classOf[NumberFormatException])
    def validate()={
      "abc".toInt
    }
  }

  def main(args: Array[String]) {
    var e = new ExceptionExample()
    e.divide(100, 10)
  }
}



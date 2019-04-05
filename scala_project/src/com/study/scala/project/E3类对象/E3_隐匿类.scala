package com.study.scala.project.E3类对象

//示例：隐匿类使用
object E3_隐匿类 {
  implicit class IntTimes(x: Int) {
    def times[B](f: => B): Unit = {   //这里的入参数是一个函数：f是函数，它的参数是A
      def loop(current: Int): Unit =
        if (current > 0) {
          f
          loop(current - 1)
        }

      loop(x)
    }
  }

  def main(args: Array[String]) {
    //4是建了一个IntTimes对象    times是调用它的方式，println是参数的函数
    4 times println("hello")
    //同步的调用方式如下
    4.times(println("Second"))
  }
}

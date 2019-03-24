package com.study.scala.project


//示例：隐匿类使用
object Run {

  implicit class IntTimes(x: Int) {
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit =
        if (current > 0) {
          f
          loop(current - 1)
        }

      loop(x)
    }
  }

}

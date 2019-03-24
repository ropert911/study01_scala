package com.study.scala.project

import Run._

/**
  * Created by sk-qianxiao on 2019/3/24.
  */
object Run_Test {
  def main(args: Array[String]) {
    //4是建了一个Run：IntTimes对象，times是调用它的方式，println是参数的函数
    4 times println("hello")
    //同步的调用方式如下
    4.times(println("Second"))
  }
}

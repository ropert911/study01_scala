package com.study.scala.project.E3类对象

/**
  * Created by sk-qianxiao on 2019/3/24.
  */
object E2_子类_Location_Test {
  def main(args: Array[String]): Unit = {
    val loc = new E2_子类_Location(10, 20, 15);
    loc.move(10, 10, 5);
  }
}

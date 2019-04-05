package com.study.scala.project.E3类对象

/**
  * Created by sk-qianxiao on 2019/3/24.
  */
object E1_类_Point_Test {
  def main(args: Array[String]): Unit = {
    val pt1 = new E1_类_Point(10, 20);
    pt1.move(10, 10);

    val pt2 = new E1_类_Point(10);
    pt2.move(10, 10);
  }
}

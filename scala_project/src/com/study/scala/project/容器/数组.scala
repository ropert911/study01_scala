package com.study.scala.project.容器

import scala.Array._

/**
  * Created by xq on 2019/3/25.
  */
object 数组 {
  def main(args: Array[String]): Unit = {
    var z = new Array[String](3) //单维数据
    var myMatrix = Array[Int](3, 3) //多维数组
    var myList2 = range(10, 20) //使用范围建数组
    var myList1 = range(10, 20, 2) //使用范围建数组：step 2
    var myList = Array(1.9, 2.9, 3.4, 3.5)


    // Print all the array elements
    for (x <- myList) {
      println(x)
    }

    // 求和
    var total = 0.0;
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);

    //找到最大值
    var max = myList(0);
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i);
    }
    println("Max is " + max);

    test1()
  }

  //连接陈列
  def test1(): Unit = {
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 = concat(myList1, myList2, myList1)

    // Print all the array elements
    for (x <- myList3) {
      println(x)
    }
  }
}

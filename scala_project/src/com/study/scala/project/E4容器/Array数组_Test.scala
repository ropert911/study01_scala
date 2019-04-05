package com.study.scala.project.E4容器

import scala.Array._

/**
  * Created by xq on 2019/3/25.
  */
object Array数组_Test {
  def main(args: Array[String]): Unit = {
    var z = new Array[String](3) //单维数据
    var myMatrix = Array[Int](3, 3) //多维数组
    var myList2 = Array.range(10, 20) //使用范围建数组
    var myList1 = Array.range(10, 20, 2) //使用范围建数组：step 2
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // 遍历数组
    for (x <- myList) {
      println(x)
    }

    // 求和
    var total = 0.0;
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }

    var myList7 = myList.iterator;
    for (x <- myList7) { //迭代器可以用这种方式
      println("7===>" + x)
    }
    while (myList7.hasNext) {
      println("7-1===>" + myList7.next())
    }

    test1()
  }

  //连接陈列
  def test1(): Unit = {
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)


    var myList3 = Array.apply[Double](2, 3, 4, 5);
    myList3 = Array.apply(2, 3, 4, 5); //创建一个T对象数组，其中T可以是：Unit，Double，Float，Long，Int，Char，Short，Byte，Boolean
    var myList4 = concat(myList1, myList2, myList1) //将所有数组连接成一个数组
    var myList5 = Array(9.0, 9.0, 9.0, 9.0, 9.0);
    Array.copy(myList4, 0, myList5, 1, 3) //将一个数组复制到另一个
    var myList6 = Array.empty[Int]; //返回一个空数组
    var myList7 = Array.iterate(0, 3)(a => a + 1) //使用迭代生成
    for (x <- myList7) {
      println("7===>" + x)
    }

    val myList8 = Array.fill(5)(10)   //生成5个10的数组
    for (x <- myList8) {
      println("8===>" + x)
    }
    val myList9 = Array.ofDim[String](5); //生成有5个元素的String数组
    for (x <- myList9) {
      println("9===>" + x)
    }
  }
}

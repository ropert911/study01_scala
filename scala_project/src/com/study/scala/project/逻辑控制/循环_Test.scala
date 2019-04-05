package com.study.scala.project.逻辑控制

import scala.util.control.Breaks

/**
  * Created by sk-qianxiao on 2019/3/21.
  */
object 循环_Test {
  def main(args: Array[String]): Unit = {
    // while loop execution
    var a = 10;
    while (a < 20) {
      println("while: " + a);
      a = a + 1;
    }

    //do-while
    a = 10;
    do {
      println("do-while: " + a);
      a = a + 1;
    } while (a < 20)

    // for ：下面的是一个范围，a从5到10
    for (a <- 5 to 10) {
      println("to: " + a);
    }

    // for loop execution with a range
    for (a <- 7 until 10) {
      println("until: " + a);
    }

    // for loop execution with a range
    for (a <- 0 to (10,2)) {
      println("to step 2: " + a);
    }

    for (a <- 0 to 10 by 2) {
      println("to step 3: " + a);
    }

    // for loop execution with a range
    for (a <- 0 until (10,2)) {
      println("util step 2: " + a);
    }

    for (a <- 0 until 10 by 2) {
      println("util step 3: " + a);
    }


    // for循环中使用由分号(;)分隔的多个范围，在这种情况下，循环将遍历给定范围所有可能的计算。
    // 以下是仅使用两个范围的示例，也可以使用两个以上的范围原文出自【易百教程】，
    for (a <- 1 to 3; b <- 1 to 3) {
      println("for two contition a5: " + a + "b5: " + b);
    }

    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    for (a <- numList) {
      println("for numList1==>" + a);
    }

    val loop = new Breaks;
    loop.breakable {
      for (a <- numList) {
        println("for numList2==> " + a);
        if (a == 4) {
          loop.break;
        }
      }
    }

  }
}

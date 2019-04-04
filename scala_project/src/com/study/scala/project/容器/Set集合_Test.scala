package com.study.scala.project.容器

//默认情况下，Scala 使用的是不可变集合，如果你想使用可变集合，需要引用 scala.collection.mutable.Set 包。
//默认引用 scala.collection.immutable.Set
import scala.collection.mutable.Set

/**
  * Created by xq on 2019/3/5.
  */
object Set集合_Test {
  def main(arg: Array[String]): Unit = {
    var s: Set[Int] = Set()
    val num1 = Set(5, 6, 9, 20, 30, 45)
    val num2 = Set(50, 60, 9, 20, 35, 55)
    val newNumbers = num1 + 3

    println("head（第一个元素） : " + num1.head)
    println("tail（除第一个外的元素） : " + num1.tail)
    println("last(最后一个元素) : " + num1.last)
    println("numbers.isEmpty : " + num1.isEmpty)
    println("最小值 : " + num1.min + "最大值 : " + num1.max + "求和 : " + num1.sum)

    println("查找不可变集合中满足指定条件的第一个元素 find==>" + num1.find(_ % 2 == 0))
    println("查找不可变集合中满足指定条件的所有元素 forall==>" + num1.forall(_ % 2 == 0))
    println(" num1.contains(30) ==> " + num1.contains(30))
    println("num1.apply(30) ==> " + num1.apply(30))
    println("num1.exists(_ == 30) ==> " + num1.exists(_ == 30))
    println("能被2整除的个数 ==> " + num1.count(_ % 2 == 0))


    num1.add(4)
    num1 += 40
    println("num1.add(4)后==>" + num1)

    //删除操作
    num1.remove(4)
    num1 -= 40
    println("删除，4，40后==>" + num1)
    println("返回丢弃前n个元素新集合 num1.drop(1)后==>" + num1.drop(1))
    println("返回丢弃前n个元素新集合 num1.dropRight(1)后==>" + num1.dropRight(1))
    println("从左向右丢弃元素，直到条件p不成立 num1.drop(1)后==>" + num1.dropWhile(_ == 30))


    println("用于比较系列是否相等  num1.equals(num2) ==>" + num1.equals(num2))

    println("过滤 fileter==>" + num1.filter(_ % 2 == 0))
    println("map操作" + num1.map(o => o * o))
    num1.foreach(o => println("foreach elem==>" + o))


    test3(num1) //转换类型
    test2(num1) //子集操作
    test4(num1, num2) //集合操作
  }

  def test2(num1: Set[Int]): Unit = {
    var tuple1 = num1.splitAt(3)
    println("原来" + num1)
    println("第一部分" + tuple1._1)
    println("第二部分" + tuple1._2)
    println("判断是否包含子集==>" + tuple1._1.subsetOf(num1))
  }

  def test3(num1: Set[Int]): Unit = {
    //转换类型
    println("转成数组后==>" + num1.toArray)
    println("转成列表后==>" + num1.toList)
    println("转成Seq后==>" + num1.toSeq)
    println("转成String后==>" + num1.toString)
  }

  def test4(num1: Set[Int], num2: Set[Int]): Unit = {
    // ++ 连接集合
    println("连接集合：num1 ++ num2 ==> " + (num1 ++ num2))
    println("连接集合：num1.++(num2) ==> " + num1.++(num2))

    // 查看交差值
    println("交差值：num1.&(num2) : " + num1.&(num2))
    println("交差值：num1.intersect(num2) : " + num1.intersect(num2))

    //差集
    println("差值：num1.diff(num2) : " + num1.diff(num2))
  }
}

package com.study.scala.mvn.Collection

/**
  * Created by xq on 2019/3/5.
  */
object Set_Test {
  def main(arg: Array[String]): Unit = {
    val numbers = Set(1, 1, 2, 5, 8)

    //Scala中的这些集合都是持久化的：更新一个Scala集合会生成一个新的集合，这个新的集合和之前版本的集合共享大部分的内容，最终的结果是数据尽可能地实现了持久
    val newNumbers = numbers + 3
    println(s"原Set" + numbers)
    println(s"新Set:" + newNumbers)

  }
}

package com.study.scala.project.E4容器

//与列表一样，元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素
object Tuple元组_Test {
  //元组和List类型，但不能修改
  def main(arg: Array[String]): Unit = {
    val raoul = ("Raoul", "+ 44 887007007")
    val alan = ("Alan", "+44 883133700")

    //元组大小为 (Int,String,String)
    val book = (2014, "Java 8 in Action", "Manning")
    val numbers = (42, 1337, 0, 3, 14)
    println(book._1) //访问元组使用数据索引
    println(numbers._4)

    //迭代
    numbers.productIterator.foreach(i => println("Value=" + i))
    println("转为字符串为: " + numbers.toString() )

    val townums = (42, 1337)
    println("交换后的元组: " + townums.swap )   //两个元素的特有的
  }
}

package com.study.scala.project.容器

/**
  * Created by xq on 2019/3/5.
  */
object Map_Test {
  def main(arg: Array[String]): Unit = {
    val nums: Map[Int, Int] = Map()
    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")
    val authorsToAge = Map("Raoul" -> 23, "Mario" -> 40, "Alan" -> 53)

    println("Keys in colors : " + colors1.keys)
    println("Values in colors : " + colors1.values)
    println("Check if colors is empty : " + colors1.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)

    //连接操作
    println("colors1 ++ colors2 : " + (colors1 ++ colors2))
    println("colors1.++(colors2)) : " + colors1.++(colors2))

    colors1.contains("red") //查看是否包含键为"red的"
    colors1.apply("red")    //返回指定键的值，如果不存在返回 Map 的默认方法
    colors1.get("red")      //返回指定 key 的值

    colors1.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + colors1(i))
    }
    colors1 - "abc" //返回一个新的 Map,删除key为"abc"的元素


    // def --(xs: GTO[A]): Map[A, B]      返回一个新的 Map, 移除 xs 对象中对应的 key
    // def clear(): Unit      清空 Map
    // def clone(): Map[A, B]      从一个 Map 复制到另一个 Map
    // def count(p: ((A, B)) => Boolean): Int      计算满足指定条件的集合元素数量
    // def default(key: A): B      定义 Map 的默认值，在 key 不存在时返回。
    // def drop(n: Int): Map[A, B]      返回丢弃前n个元素新集合
    // def dropRight(n: Int): Map[A, B]      返回丢弃最后n个元素新集合
    // def dropWhile(p: ((A, B)) => Boolean): Map[A, B]      从左向右丢弃元素，直到条件p不成立
    // def equals(that: Any): Boolean      如果两个 Map 相等(key/value 均相等)，返回true，否则返回false
    // def exists(p: ((A, B)) => Boolean): Boolean      判断集合中指定条件的元素是否存在
    // def filter(p: ((A, B))=> Boolean): Map[A, B]      返回满足指定条件的所有集合
    // def filterKeys(p: (A) => Boolean): Map[A, B]      返回符合指定条件的不可变 Map
    // def find(p: ((A, B)) => Boolean): Option[(A, B)]      查找集合中满足指定条件的第一个元素
    // def foreach(f: ((A, B)) => Unit): Unit      将函数应用到集合的所有元素
    // def init: Map[A, B]      返回所有元素，除了最后一个
    // def isEmpty: Boolean      检测 Map 是否为空
    // def keys: Iterable[A]      返回所有的key/p>
    // def last: (A, B)      返回最后一个元素
    // def mkString: String      集合所有元素作为字符串显示
    // def product: (A, B)      返回集合中数字元素的积。
    // def remove(key: A): Option[B]      移除指定 key
    // def retain(p: (A, B) => Boolean): Map.this.type      如果符合满足条件的返回 true
    // def tail: Map[A, B]      返回一个集合中除了第一元素之外的其他元素
    // def take(n: Int): Map[A, B]      返回前 n 个元素
    // def takeRight(n: Int): Map[A, B]      返回后 n 个元素
    // def takeWhile(p: ((A, B)) => Boolean): Map[A, B]      返回满足指定条件的元素

    print("max:" + colors1.max + "min:" + colors1.min + "sum:" + colors1.sum + "size:" + colors1.size)

    println(colors1.toSet) //转成 Set((red,#FF0000), (azure,#F0FFFF), (peru,#CD853F))
    println(colors1.toSeq)
    println(colors1.toList)
    println(colors1.toArray)
    //def copyToArray(xs: Array[(A, B)]): Unit      复制集合到数组

  }

}

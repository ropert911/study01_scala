package com.study.scala.project.容器

/**
  * Created by xq on 2019/4/5.
  */
object Iterator_Test {
  def main(arg: Array[String]): Unit = {
    val it = Iterator("a", "number", "of", "words")
    val ita = Iterator(20, 40, 2, 50, 69, 90)
    val itb = Iterator(20, 40, 2, 50, 69, 90)

    while (it.hasNext) {
      println(it.next())
    }

    println("Maximum valued element " + ita.max)
    println("Minimum valued element " + itb.min)

    println("Value of ita.size : " + ita.size)
    println("Value of itb.length : " + itb.length)
  }
}

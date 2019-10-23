package com.study.scala.project.E4容器

/**
  * @author sk-qianxiao
  * @date 2019/10/22
  */
object Seq_Test {
  def main(rg: Array[String]): Unit ={
    val seq = Seq('a' to 'z': _*)
    seq.indexOf('c') // 输出：2
    seq.lastIndexOf('h') // 输出：7
  }
}

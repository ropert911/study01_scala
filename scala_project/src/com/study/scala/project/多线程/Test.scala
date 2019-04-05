package com.study.scala.project.多线程


object Test {
  def main(args: Array[String]) {
    var t1 = new ThreadExample()


    var e = new ThreadExample2()
    var t2 = new Thread(e)
    t1.setName("线程1")
    t2.setName("线程2")
    t1.start()
    t2.start()

    t1.join() //方法等待线程死机
    t2.join()

  }
}

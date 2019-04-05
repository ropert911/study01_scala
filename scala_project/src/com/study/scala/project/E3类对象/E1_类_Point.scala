package com.study.scala.project.E3类对象

class E1_类_Point(xc: Int, yc: Int) {
  //没有访问限定就是public
  protected var x: Int = xc
  protected var y: Int = yc

  //基它构造函数
  def this(xc: Int) {
    this(xc, 0) //调用主构造函数
  }

  //基它构建参数
  def this() {
    this(0, 0)
    this.x = 0
    this.y = 0
  }

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("Point x location : " + x);
    println("Point y location : " + y);
  }
}




package com.study.scala.project

/**
  * Created by sk-qianxiao on 2019/3/24.
  */
//后面的参数是构建函数，后面是继承类
class Location(val xc: Int, val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point x location : " + x);
    println("Point y location : " + y);
    println("Point z location : " + z);
  }
}

package com.study.scala.project.E3类对象

//子类示例
//后面的参数是构建函数，后面是继承类
class E2_子类_Location(val xc: Int, val yc: Int, val zc: Int) extends E1_类_Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
//    super.move(dx, dy)
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point x location : " + x);
    println("Point y location : " + y);
    println("Point z location : " + z);
  }
}

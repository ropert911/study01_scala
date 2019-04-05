package com.study.scala.project.类对象

import com.study.scala.project.类对象.util.SingletonObject


object E4_单例和伴生_Test {
  def main(args: Array[String]) {
    SingletonObject.hello()   // No need to create object.
    new SingletonObject().hello()
  }
}

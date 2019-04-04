package com.study.scala.project.Model

/**
  * Created by xq on 2019/3/5.
  */
class Person(agex: Int, carx: Car) {
  val age: Int = agex
  val car: Option[Car] = Some(carx)

  def getAge(): Int = {
    age
  }

  def getCar(): Option[Car] = {
    car
  }
}

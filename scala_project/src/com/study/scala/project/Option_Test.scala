package com.study.scala.project

import com.study.scala.project.E1Model.Person

/**
  * Created by xq on 2019/3/5.
  */
object Option_Test {
  def main(arg: Array[String]): Unit = {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(10): " + b.getOrElse(10))
    println("a.isEmpty: " + a.isEmpty)
    println("b.isEmpty: " + b.isEmpty)
  }

  def getCarInsuranceName(person: Option[Person], minAge: Int) =
    person.filter(_.getAge() >= minAge)
      .flatMap(_.car)
      .flatMap(_.getInsurance)
      .map(_.getName).getOrElse("Unknown")
}

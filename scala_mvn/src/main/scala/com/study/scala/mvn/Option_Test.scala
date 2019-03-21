package com.study.scala.mvn

import com.study.scala.mvn.Model.Person

/**
  * Created by xq on 2019/3/5.
  */
object Option_Test {
  def main(arg: Array[String]): Unit = {

  }

  def getCarInsuranceName(person: Option[Person], minAge: Int) =
    person.filter(_.getAge() >= minAge)
      .flatMap(_.car)
      .flatMap(_.getInsurance)
      .map(_.getName).getOrElse("Unknown")
}

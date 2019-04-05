package com.study.scala.project.E1Model

/**
  * Created by xq on 2019/3/5.
  */
class Car(ix: Insurance) {
  var insurance: Option[Insurance] = Some(ix);

  def getInsurance(): Option[Insurance] = {
    insurance
  }
}

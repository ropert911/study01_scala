package com.study.scala.project.E3类对象


object E5_Case类_Test {

  trait SuperTrait

  case class CaseClass1(a: Int, b: Int) extends SuperTrait

  case class CaseClass2(a: Int) extends SuperTrait // Case class
  case object CaseObject extends SuperTrait // Case object

  //case类默认是不可变的;所有参数默认使用public和immutable修辞符
  //所以纯数据处理常用
  case class CaseClass(a: Int, b: Int)

  def main(args: Array[String]) {
    callCase(CaseClass1(10, 10))
    callCase(CaseClass2(10))
    callCase(CaseObject)

    var c = CaseClass(10, 10) // 不使用new关键字实例化对象
    println("a = " + c.a) // Accessing elements of case class
    println("b = " + c.b)
  }

  def callCase(f: SuperTrait) = f match {
    case CaseClass1(f, g) => println("a = " + f + " b =" + g)
    case CaseClass2(f) => println("a = " + f)
    case CaseObject => println("No Argument")
  }
}

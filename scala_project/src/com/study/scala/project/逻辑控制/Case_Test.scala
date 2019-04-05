package com.study.scala.project.逻辑控制

/**
  * Created by xq on 2019/4/5.
  */
object Case_Test {
  case class Person(name: String, age: Int)

  def main(args: Array[String]) {
    println(matchTest(3))

    println(matchTest2("two"))
    println(matchTest2("test"))
    println(matchTest2(1))

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println(
          "Age: " + age + " year, name: " + name + "?")
      }
    }
  }

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  def matchTest2(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }
}

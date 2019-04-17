package com.study.scala.project.E2逻辑控制

/**
  * Created by xq on 2019/4/5.
  */
object Case_Test {

  case class Person(name: String, age: Int)

  def main(args: Array[String]) {
    val x = 6
    val a = if (x > 0) {
      println("This is a positive number")
      1
    } else {
      println("This is a negative number")
      -1
    }
    printf("返回值 %d\n", a)

    println(matchTest(3))

    println(matchTest2("two"))
    println(matchTest2("test"))
    println(matchTest2(1))


  }

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  //一般匹配
  def matchTest2(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }

  //类型匹配
  def typeCase() {
    for (elem <- List(9, 12.3, "Spark", "Hadoop", 'Hello)) {
      val str = elem match {
        case i: Int => i + " is an int value."
        case d: Double => d + " is a double value."
        case "Spark" => "Spark is found."
        case s: String => s + " is a string value."
        case _ => "This is an unexpected value."
      }
      println(str)
    }
  }

  //守卫
  def guard() {
    for (elem <- List(1, 2, 3, 4)) {
      elem match {
        case _ if (elem % 2 == 0) => println(elem + " is even.")
        case _ => println(elem + " is odd.")
      }
    }
  }

  //类的匹配
  def classCase(): Unit = {
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
}

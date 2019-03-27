package com.study.scala.project.容器

/**
  * Created by xq on 2019/3/5.
  */
object List链表_Test {
  def main(arg: Array[String]) {
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit3 = List.fill(3)("apples") //3个apples


    val nums: List[Int] = List(1, 2, 3, 4)
    val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))
    val squares = List.tabulate(6)(n => n * n)  //List(0, 1, 4, 9, 16, 25)
    val mul = List.tabulate(4, 5)(_ * _)        //List(List(0, 0, 0, 0, 0), List(0, 1, 2, 3, 4),  List(0, 2, 4, 6, 8), List(0, 3, 6, 9, 12))


    val empty: List[Nothing] = List()
    val empty2 = Nil
    for (o <- fruit1) {
      println("fruit=>" + o)
    }
    println("Head of fruit : " + fruit1.head)
    println("Tail of fruit : " + fruit1.tail)
    println("Check if fruit is empty : " + fruit1.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)
    var fruit = fruit1 ::: fruit2 //链接列表
    fruit = fruit1.:::(fruit2) //链接列表
    fruit = List.concat(fruit1, fruit2) //链接列表
    println("After reverse fruit : " + fruit.reverse) //反转列表

    test2()
  }

  def test2(): Unit = {
    val authors = List("Raoul", "Mario", "Alan")

    //集合提供了 java类型stream一样的操作
    val linesLongUpper = authors.filter(l => l.length() > 10).map(l => l.toUpperCase())
    val linesLongUpper2 = authors.filter(_.length() > 10).map(_.toUpperCase())

    val tweets = List(
      "I love the new features in Java 8",
      "How's it going?",
      "An SQL query walks into a bar, sees two tables and says 'Can I join you?'"
    )
    println(s"===========包含Java的字符串")
    tweets.filter(isJavaMentioned).foreach(println)
    println(s"===========小于20的字符串")
    tweets.filter(_.length < 20).foreach(println)
    println(s"===========大于30的字符串")
    val isLongTweet: String => Boolean //匿名函数
    = (tweet: String) => tweet.length() > 30
    tweets.filter(isLongTweet).foreach(println)

    println(s"===========大于60的字符串")
    val isLongTweet2 = new Function1[String, Boolean] {
      def apply(tweet: String): Boolean = tweet.length() > 60
    }
    tweets.filter(isLongTweet2).foreach(println)
  }

  def isJavaMentioned(tweet: String): Boolean = tweet.contains("Java")

}

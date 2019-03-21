package com.study.scala.mvn.Collection

/**
  * Created by xq on 2019/3/5.
  */
object List_Test {
  def main(arg: Array[String]) {
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

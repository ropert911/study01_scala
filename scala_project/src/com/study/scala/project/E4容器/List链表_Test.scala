package com.study.scala.project.E4容器

/**
  * Created by xq on 2019/3/5.
  */
object List链表_Test {
  def main(arg: Array[String]) {
    val empty: List[Nothing] = List()
    val empty2 = Nil
    val nums: List[Int] = List(1, 4, 2, 3, 3, 4, 4)
    val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit3 = List.fill(3)("apples") //3个apples
    val squares = List.tabulate(6)(n => n * n) //List(0, 1, 4, 9, 16, 25)
    val mul = List.tabulate(4, 5)(_ * _) //List(List(0, 0, 0, 0, 0), List(0, 1, 2, 3, 4),  List(0, 2, 4, 6, 8), List(0, 3, 6, 9, 12))


    println("nums.contains(3)==>" + nums.contains(3))
    println("是否有3：" + nums.exists(a => a == 3))
    println("是否全部大于0：" + nums.forall(a => a > 0))
    println("nums.indexOf(4, 1)=>" + nums.indexOf(4, 1)) //在索引位置之后，查找列表中第一个出现值的索引
    println("distinct后的列表：" + nums.distinct) //从列表中创建一个新的列表，而不会有任何重复的元素
    println("take(2)后的列表：" + nums.take(2)) // 返回第一个“n”个元素。
    println("nums.takeRight后的列表：" + nums.takeRight(2)) //返回最后的“n”个元素。
    println("nums.drop(2)==>" + nums.drop(2)) //返回除了前n个之外的所有元素。
    println("nums.dropRight(2)==>" + nums.dropRight(2)) //返回除最后n个之外的所有元素。

    for (o <- fruit1) {
      println("fruit=>" + o)
    }

    //链接列表
    {
      println("Head of fruit : " + fruit1.head) //apples
      println("Tail of fruit : " + fruit1.tail) //List(oranges, pears)    返回除第一个之外的所有元素
      println("last of fruit : " + fruit1.last) //返回最后一个元素 pears
      println("length of fruit : " + fruit1.length)
      println("Check if fruit is empty : " + fruit1.isEmpty)
      println("Check if nums is empty : " + nums.isEmpty)
      var fruit = fruit1 ::: fruit2 //链接列表
      fruit = fruit1.:::(fruit2) //链接列表
      fruit = List.concat(fruit1, fruit2) //链接列表
    }

    println("After reverse fruit : " + fruit3.reverse) //反转列表

    //类型于Stream的操作
    test2()


    var num3 = nums2.reverse
    var num4 = num3.sorted
    println(num3)
    println(num4)
    println("最小==>" + num4.min)
    println("最大==>" + num4.max)
    println("求和==>" + num4.sum)
    println(" num4.apply==>" + num4.apply(2)) //通过列表中的索引选择一个元素
    println("num4.mkString==>" + num4.mkString) //1234    显示字符串中列表的所有元素
    println("num4.mkString'==>" + num4.mkString("|")) //1|2|3|4   使用分隔符字符串显示字符串中列表的所有元素

    var xArray = num4.toArray //转为Array
    var xSet = num4.toSet //转为Set
    println("toSet=>" + xSet)

    //    var abc = num4.toMap
    //    println(abc)

    //    def ::(x: A): List[A]    向列表开头位置添加一具元素。
    //    def :::(prefix: List[A]): List[A]    在此列表前添加给定列表中的元素。
    //    def ::(x: A): List[A]    在列表的开头添加一个元素x
    //    def addString(b: StringBuilder): StringBuilder    将列表的所有元素附加到字符串构建器。
    //    def addString(b: StringBuilder, sep: String): StringBuilder    使用分隔符字符串将列表的所有元素附加到字符串构建器。
    //    def copyToArray(xs: Array[A], start: Int, len: Int): Unit    将列表的元素复制到数组。在给定的数组xs中填充该列表的最多为长度(len)元素，从start位置开始。
    //    def dropWhile(p: (A) => Boolean): List[A]    删除满足谓词的元素的最长前缀。
    //    def endsWith[B](that: Seq[B]): Boolean    测试列表是否以给定的顺序结束。
    //    def equals(that: Any): Boolean    任意序列的equals方法，将此序列与其他对象进行比较。
    //    def init: List[A]    返回除上一个以外的所有元素。
    //    def intersect(that: Seq[A]): List[A]    计算列表和另一个序列之间的多集合交集。
    //    def iterator: Iterator[A]    在可迭代对象中包含的所有元素上创建一个新的迭代器。
    //    def lastIndexOf(elem: A, end: Int): Int    查找列表中某些值的最后一次出现的索引; 在给定的结束指数之前或之中。
    //    def startsWith[B](that: Seq[B], offset: Int): Boolean    测试列表是否包含给定索引处的给定序列。
    //    def toBuffer[B >: A]: Buffer[B]    将列表转换为可变缓冲区。
    //    def toMap[T, U]: Map[T, U]    将此列表转换为映射。
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

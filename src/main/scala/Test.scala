/**
  * Created by xq on 2019/3/5.
  */
object Test {
  def main(args: Array[String]) {
    var n: Int = 2
    while (n <= 6) {
      println(s"Hello ${n} bottles of beer")
      n += 1
    }

    println(s"========使用Int的to方法 生成区间，to方法用中缀表达式")
    2 to 6 foreach { n => println(s"Hello ${n} bottles of beer") }
  }
}

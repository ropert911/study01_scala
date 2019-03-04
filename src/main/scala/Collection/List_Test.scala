package Collection

/**
  * Created by xq on 2019/3/5.
  */
object List_Test {
  def main(arg: Array[String]) {
    val authors = List("Raoul", "Mario", "Alan")

    //集合提供了 java类型stream一样的操作
    val linesLongUpper = authors.filter(l => l.length() > 10).map(l => l.toUpperCase())
    val linesLongUpper2 = authors.filter(_.length() > 10).map(_.toUpperCase())
  }
}

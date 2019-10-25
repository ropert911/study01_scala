package com.study.scala.project

import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

/**
  * @author sk-qianxiao
  * @date 2019/10/25
  */
object 时间_Test {
  def main(args: Array[String]) {
    val now = new Date()
    val date = new SimpleDateFormat("yyyyMMddHH").format(now)
    println(date)

    val sj = new SimpleDateFormat("yyyyMMddHH")
    val calendar = Calendar.getInstance
    println("当前==>" + sj.format(calendar.getTime))
    calendar.add(Calendar.DATE, -1)
    System.out.println("前一天：" + sj.format(calendar.getTime))
  }
}

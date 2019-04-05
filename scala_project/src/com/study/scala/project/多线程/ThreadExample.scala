package com.study.scala.project.多线程

//通过扩展Thread类
class ThreadExample extends Thread {
  override def run() {
    Thread.sleep(500)

    println("[" + this.getName + "]:" + "Thread is running?");
  }
}
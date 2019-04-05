package com.study.scala.project.多线程

class ThreadExample2 extends Runnable {
  override def run() {
    Thread.sleep(500)
    println("Thread is running...")
  }
}
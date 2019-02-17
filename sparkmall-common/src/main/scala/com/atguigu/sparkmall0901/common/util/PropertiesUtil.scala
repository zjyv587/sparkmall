package com.atguigu.sparkmall0901.common.util

import java.io.InputStreamReader
import java.util.Properties

object PropertiesUtil {
  def load(propertieName: String): Properties= {
    val prop = new Properties()
    prop.load(
      new InputStreamReader(Thread.currentThread().getContextClassLoader.getResourceAsStream(propertieName),"UTF-8")
    )
    prop
  }

  def main(args: Array[String]): Unit = {
    val properties : Properties = PropertiesUtil.load("config.properties")
    println(properties.getProperty("kafka.broker.list"))
  }
}

package com.abz.apps

import com.abz.core.Core

object App2 {
  def main(args: Array[String]) {
    for (arg <- args) println(Core.upper(arg))
  }
}

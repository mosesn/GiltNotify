package com.poller

import scala.actors.Actor

object Poller extends Actor {

  private[this] val MIN = 60 * 1000
  private[this] val INTERVAL = 5 * MIN

  def act() {
    while (true) {
      println("got string");
      Thread.sleep(INTERVAL);
    }
  }
}

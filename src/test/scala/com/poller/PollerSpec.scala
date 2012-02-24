package com.poller
import org.scalatest.Spec

class PollerSpec extends Spec {

  describe("Poller") {
    describe("(getting upcoming sales)") {
      it("sees all sales") {
        Poller.start()
      }
      it("sees all sales from a store") (pending)
      it("filters seen sales") (pending)
    }
  }

}

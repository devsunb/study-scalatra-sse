package me.jslee.sse

import org.scalatra.test.scalatest._

class TestSSETests extends ScalatraFunSuite {

  addServlet(classOf[TestSSE], "/*")

  test("GET / on TestSSE should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}

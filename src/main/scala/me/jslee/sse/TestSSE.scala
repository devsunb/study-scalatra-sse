package me.jslee.sse

import org.scalatra._

class TestSSE extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}

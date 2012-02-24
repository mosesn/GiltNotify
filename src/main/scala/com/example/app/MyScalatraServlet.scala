package com.example.app

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends ScalatraServlet with ScalateSupport {

  before() {
    contentType = "text/html"
  }

  get("/") {
    templateEngine.layout("/WEB-INF/layouts/root.scaml")
  }

  notFound {
    findTemplate(requestPath) map { path =>
      contentType = "text/html"
      layoutTemplate(path)
    } orElse serveStaticResource() getOrElse resourceNotFound()
  }
}

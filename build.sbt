organization := "com.example"

name := "GiltNotify"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.3",
  "org.scalatra" %% "scalatra-scalate" % "2.0.3",
  "org.scalatra" %% "scalatra-specs2" % "2.0.3" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "7.5.4.v20111024" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.aurum" %% "aurum" % "1.0-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "1.7.1" % "test"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

val ScalatraVersion = "2.7.0"

organization := "me.jslee"

name := "Test SSE"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.6"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.28.v20200408" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "com.typesafe.akka" %% "akka-actor" % "2.3.15",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.1",
  "org.eclipse.jetty.websocket" % "websocket-server" % JettyVersion
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)

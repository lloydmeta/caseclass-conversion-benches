name := """shapeless-labelledgeneric-benches"""

enablePlugins(JmhPlugin)

version := "1.0-SNAPSHOT"

organization := "com.example"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.chuusai"   %% "shapeless" % "2.3.2",
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP6" % Test
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)

wartremoverErrors in (Compile, compile) ++= Warts.unsafe

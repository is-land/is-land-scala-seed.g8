name := "$name$"

version := "$projectV$"

organizationName := "is-land Systems Inc."

organizationHomepage := Some(url("https://github.com/is-land"))

organization := "$organization$"

scalaVersion := "$scalaV$"

scalacOptions ++= Seq(
  "-target:jvm-1.8",
  "-deprecation",
  "-encoding", "utf-8",
  "-explaintypes",
  "-feature",
  "-language:implicitConversions",
  "-unchecked",
  "-Xlint",
  "-Ywarn-dead-code",
  "-Ywarn-unused:implicits",
  "-Ywarn-unused:imports",
  "-Ywarn-unused:locals",
  "-Ywarn-unused:params",
  "-Ywarn-unused:patvars",
  "-Ywarn-unused:privates",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)
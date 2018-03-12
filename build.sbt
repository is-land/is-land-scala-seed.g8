name := "is-land-scala-seed"

version := "0.1"

scalaVersion := "2.12.4"

enablePlugins(Giter8Plugin)

resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-XX:MaxPermSize=256m", "-Xss2m", "-Dfile.encoding=UTF-8")

test in Test := {
  val _ = (g8Test in Test).toTask("").value
}

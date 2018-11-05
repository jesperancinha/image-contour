name := "image-train-filters"

version := "1.0"

scalaVersion := "2.12.7"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5" % "test"
libraryDependencies += "net.liftweb" % "lift-json_2.11" % "2.6.2"
libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.7.2" % "test",
  "junit" % "junit" % "4.11" % "test",
  "net.liftweb" %% "lift-json" % "2.6",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "mysql" % "mysql-connector-java" % "5.1.25",
  "ch.qos.logback" % "logback-classic" % "1.0.13",
  "com.typesafe.akka" %% "akka-actor" % "2.5.17",
  "com.typesafe.akka" %% "akka-stream" % "2.5.17",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.11.2",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.5",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.5",
  "com.eed3si9n" %% "sbt-assembly" % "0.14.8",
)

resolvers += Resolver.url("bintray-sbt-plugins", url("https://dl.bintray.com/eed3si9n/sbt-plugins/"))(Resolver.ivyStylePatterns)

resolvers ++= Seq(
  "Spray repository" at "http://repo.spray.io",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)


scalacOptions in Test ++= Seq("-Yrangepos")

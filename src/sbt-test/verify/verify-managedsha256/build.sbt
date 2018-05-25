name := "verify-managed"

organization := "uk.co.josephearl"

version := "0.2.0"

scalaVersion := "2.10.4"

libraryDependencies += "com.google.guava" % "guava" % "19.0"

verifyDependencies in verify += "com.google.guava" % "guava" sha256 "58d4cc2e05ebb012bbac568b032f75623be1cb6fb096f3c60c72a86f7f057de4"

verifyOptions in verify := VerifyOptions(includeBin = false, includeScala = false, includeDependency = true)

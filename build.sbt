name := """libling-with-dependencies"""
scalaVersion := "2.12.2"

// the libling library plugin configures this build as a libling
enablePlugins(HacklingLibraryPlugin)

// choose your test framework
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.9" % "test"

sourceDependencies += Dependency(
    Version("ef33ab5a6eac7af6b2f6a8d238ccdc88e25171a2"),
    Repositories(uri("https://github.com/libling/libling-skeleton.git")))
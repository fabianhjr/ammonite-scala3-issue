lazy val scala3 =
  (project in file("scala3"))
    .settings(
      name := "scala3",
      scalaVersion := "3.2.2"
    )

lazy val scala2 = {
  (project in file("scala2"))
    .settings(
      name := "scala2",
      scalaVersion := "2.13.10",
      scalacOptions += "-Ytasty-reader",
      libraryDependencies += "com.lihaoyi" % "ammonite" % "2.5.8" cross CrossVersion.full
    )
    .dependsOn(scala3)
}

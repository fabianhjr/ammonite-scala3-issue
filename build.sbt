lazy val scala3 =
  crossProject(JVMPlatform)
    .crossType(CrossType.Pure)
    .settings(
      name := "scala3",
      scalaVersion := "3.2.2"
    )

lazy val scala2 =
  crossProject(JVMPlatform)
    .crossType(CrossType.Pure)
    .settings(
      name := "scala2",
      scalaVersion := "2.13.10",
      libraryDependencies += "com.lihaoyi" % "ammonite" % "2.5.8" cross CrossVersion.full
    )
    .dependsOn(scala3)

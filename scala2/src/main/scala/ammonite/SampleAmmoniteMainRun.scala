package ammonite

object SampleAmmoniteMainRun {
  def main(): Unit = {
    ammonite.Main().run("sampleValue" -> SampleEnum.One)
  }
}

package ammonite

object SampleAmmoniteMainRun {
  def main(): Unit = {
    val sampleValue = SampleValue.One
    ammonite.Main().run("sampleValue" -> sampleValue)
  }
}

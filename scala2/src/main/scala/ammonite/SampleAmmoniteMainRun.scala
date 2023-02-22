package ammonite

object SampleAmmoniteMainRun {
  def main(args: Array[String]): Unit = {
    val sampleValue = SampleEnum.One
    println(s"Without issues: $sampleValue")
    println()
    println()
    println()
    println()
    println()
    println("Now ammonite:")
    ammonite.Main().run("sampleValue" -> sampleValue)
  }
}

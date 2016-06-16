object Ex0207 extends App {

  def printProductOfUnicodes(str: String) {
    println(str.foldLeft(1)((o: Int, n: Char) => o * n.toInt))
  }

  printProductOfUnicodes("Hello")
}

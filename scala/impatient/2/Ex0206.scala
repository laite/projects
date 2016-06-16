object Ex0206 extends App {

  def printProductOfUnicodes(str: String) {
    var product = 1
    for (ch <- str; code = ch.toInt) {
      product *= code
    }
    
    println(product)
  }

  printProductOfUnicodes("Hello")
}

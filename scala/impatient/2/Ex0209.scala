object Ex0209 extends App {

  def printProductOfUnicodes(str: String) {

    def getProduct(value: Int, list: Seq[Int]): Int = {
      if (list.size == 0) value
      else getProduct(value * list.head, list.tail)
    }

    var product = getProduct(1, str.toSeq.map(_.toInt))
    println(product)
  }

  printProductOfUnicodes("Hello")
}

/*Exiba  o maior elemento de uma lista.
 Teste nas listas de teste.
 */
/*-------------------------------------------------------------------------------------------------------------- */
fun main(){
  val triangulo :List<Int> = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
  val fibonacci :List<Int> = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
  val vazio :List<Int> = listOf<Int>()
/*-------------------------------------------------------------------------------------------------------------- */
/*println("Teste ${triangulo.isNullOrEmpty()}")                                                                         */
/*-------------------------------------------------------------------------------------------------------------- */
  if ("${triangulo.isNullOrEmpty()}" == "true"){
      println("A lista triangulo não contém elementos.\n")
  }else{
      val ordenado = triangulo.sortedBy{it.dec()}
      println("O maior elemento da lista triangulo é ${ordenado.last()}.\n")     
  }
  if ("${fibonacci.isNullOrEmpty()}" == "true"){
      println("A lista fibonacci não contém elementos.\n")
  }else{
      val ordenado = fibonacci.sortedBy{it.dec()}
      println("O maior elemento da lista fibonacci é ${ordenado.last()}.\n")
  }
  if ("${vazio.isNullOrEmpty()}" == "true"){
      println("A lista vazio não contém elementos.\n")
  }else{
      val ordenado = fibonacci.sortedBy{it.dec()}
      println("O maior elemento da lista vazio é ${ordenado.last()}.\n")
  }
}
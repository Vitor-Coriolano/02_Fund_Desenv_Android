/*
1.	Olhe a documentação sobre listas em Kotlin:
     1.1.	Escolha 3 métodos descritos na documentação e crie um pequeno programa que demonstre como utilizá-los
     (podem ser situações completamente diferentes).
Faça comentários explicando o uso. 
 */
fun main(){
  val triangulo :List<Int> = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
  val fibonacci :List<Int> = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
  val vazio     :List<Int> = listOf<Int>()
  
  usoListas(triangulo)
  usoListas(fibonacci)
}

fun usoListas(lista: List<Int>){

  //usando o metódo size para retornar o tamanho da lista
  var tamanho = lista.size
  println("O tamanho da lista $lista é $tamanho\n")

  //usando o metódo contanis para verificar se na lista existe um elemento especifico
  var existeElemento = lista.contains(1)
  var existeElemento2 = lista.contains(190769)
  println("Verificando se na lista $lista existe o elemento 1: $existeElemento\n")
  println("Verificando se na lista $lista existe o elemento 190769: $existeElemento2\n")

  //usando o metódo indexOf para retornar o indíce do elemento buscado ou -1 se não existir
  var indexElemento = lista.indexOf(1)
  var indexElemento2 = lista.indexOf(190769)
  println("Verificando o indice do elemento 1 na lista: $indexElemento\n")
  println("Verificando o indice do elemento 190769 na lista: $indexElemento2\n")
  }
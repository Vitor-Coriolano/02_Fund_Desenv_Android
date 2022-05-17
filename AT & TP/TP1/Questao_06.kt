 /*Crie uma função que receba uma lista de números inteiros e retorne uma nova lista, com a mesma
  quantidade de elementos, mas onde há um número primo que seja trocado pelo número 1 e os
  demais por 0.
  Teste nas listas de teste e em exemplos próprios.*/
  fun main(){
  val triangulo :List<Int> = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
  val fibonacci :List<Int> = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
  val vazio     :List<Int> = listOf<Int>()
  val nova_lista :MutableList<Int> = arrayListOf<Int>()
 /*-------------------------------------------------------------------------------------------------------------- */
    if ("${triangulo.isNullOrEmpty()}" == "false"){
        for(i in triangulo.indices){
          if (triangulo[i] == 1){
            nova_lista.add(0)
          }
          else{
            if (triangulo[i] == 2){
              nova_lista.add(1)
            }
            else{
              if (triangulo[i]%2 == 0){
                nova_lista.add(0)
              }
              else{
                nova_lista.add(1)
              }
           }
           }
       }
       println("O resultado do processamento da lista triângulo é ${nova_lista}")
    }
  }
  
/*Eexiba a soma de todos os números pares e o produto de todos os números ímpares de uma lista.
 Teste nas listas de teste.*/
 /*Exiba  o maior elemento de uma lista.
 Teste nas listas de teste.
 */
/*-------------------------------------------------------------------------------------------------------------- */
/*-------------------------------------------------------------------------------------------------------------- */
fun main(){
  val triangulo :List<Int> = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
  val fibonacci :List<Int> = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
  val vazio     :List<Int> = listOf<Int>()
  var num_par   :Int = 0
  var num_impar :Int = 1 /* Todo e qualquer número multiplicado por 1 é igual a ele mesmo */
/*-------------------------------------------------------------------------------------------------------------- */
  
    if ("${triangulo.isNullOrEmpty()}" == "false"){
        for(i in triangulo.indices){
            if (triangulo[i]%2 == 0){
                var par = triangulo[i]
                num_par += par               
            }else{
                var impar = triangulo[i]
                num_impar *= impar
            }
        }
        println("O resultado da soma dos números pares da lista triângulo é ${num_par}")
        println("O resultado do produto dos números impares da lista triângulo é ${num_impar}\n")
        num_par = 0
        num_impar = 1
    }
    if ("${fibonacci.isNullOrEmpty()}" == "false"){
        for(i in fibonacci.indices){
            if (fibonacci[i]%2 == 0){
                var par = fibonacci[i]
                num_par += par               
            }else{
                var impar = fibonacci[i]
                num_impar *= impar
            }
        }
        println("O resultado da soma dos números pares da lista fibonacci é ${num_par}")
        println("O resultado do produto dos números impares da lista fibonacci é ${num_impar}")
        num_par = 0
        num_impar = 1
    }
    if ("${vazio.isNullOrEmpty()}" == "false"){
        for(i in vazio.indices){
            if (vazio[i]%2 == 0){
                var par = vazio[i]
                num_par += par               
            }else{
                var impar = vazio[i]
                num_impar *= impar
            }
        }
        println("O resultado da soma dos números pares da lista vazio é ${num_par}")
        println("O resultado do produto dos números impares da lista vazio é ${num_impar}")
    }
}
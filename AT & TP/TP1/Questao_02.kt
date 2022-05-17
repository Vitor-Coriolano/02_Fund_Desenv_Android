/*Exiba "Infnet" sê o primeiro elemento da lista for menor que o último, caso contrário 
exiba "Tenfni"
*/
/*-------------------------------------------------------------------------------------------------------------- */
fun main(){
   val triangulo :List<Int> = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
   println("A lista contem ${triangulo.size} elementos.\n")
   println("A lista consta dos seguintes elementos: $triangulo\n")
   println("O primeiro elemento da lista é ${triangulo.first()}\n")
   println("O último elemento da lista é ${triangulo.last()}\n")
   var primeiro = Integer.parseInt("${triangulo.first()}")
   var ultimo = Integer.parseInt("${triangulo.last()}")
   if(primeiro < ultimo){
     println("Infnet\n")
   }else{
     println("Tenfni")
  }
}
/*
Hashing de strings
1 - Para cada letra na palavra, você irá calcular um valor associado. Este valor será igual ao número que representa a letra vezes a posição da letra na palavra.
2 - O valor associado à palavra será igual à soma dos valores associados a cada uma de suas letras — é esse valor que deve ser retornado. 
  */
  fun main(){
    hashingStrings("cafe")
    hashingStrings("elvis")
    hashingStrings("infnet")
}    
    
fun hashingStrings(palavra: String){
    var soma = 0
    val valorLetraLista = listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",)

    for(letra in palavra) {
        println("${letra.lowercaseChar()} " + (valorLetraLista.indexOf(letra.toString()) + 1) + " X " + (palavra.indexOf(letra)+1))
        soma += (valorLetraLista.indexOf(letra.toString()) + 1) * (palavra.indexOf(letra) + 1)
    }

    println("Hasing de $palavra = $soma\n")
}
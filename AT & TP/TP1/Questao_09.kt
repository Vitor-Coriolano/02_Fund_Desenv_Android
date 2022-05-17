/*
1.	Escreva uma classe que modele uma data.
Represente dia, mês e ano como números.
Escreva métodos para responder às seguintes perguntas:
    1.1.	A data se encontra em ano bissexto?
    1.2.	Quantos dias têm o mês da data?
    1.3.	Quantos dias existem entre o dia da data e o primeiro dia do ano inclusive?
*/
fun main(){
  FormataDdata(5,11,2022) /* Dia do meu aniversário :)*/
}
fun FormataDdata(dia: Int, mes: Int, ano: Int){
  val anoBissexto = anoBissexto(ano)

  //A data se encontra em ano bissexto?
  if(anoBissexto){
    println("O ano de $ano é bissexto.")
  } else {
    println("O ano de $ano é nao bissexto.")
  }

  //Quantos dias têm o mês da data?
  if(anoBissexto && mes == 2){
    println("O mes $mes possui ${diasMes(mes)+1} dias.")
  } else {
    println("O mes $mes possui ${diasMes(mes)} dias.")
  }

  //Quantos dias existem entre o dia da data e o primeiro dia do ano inclusive?
   if(anoBissexto && mes!=1){
     println("O intervalo de dias de $dia/$mes/$ano até o começo do ano é ${quantidadeDiasComecoDoAno(dia,mes)+1}.")
    } else {
      println("O intervalo de dias de $dia/$mes/$ano até o começo do ano é ${quantidadeDiasComecoDoAno(dia,mes)}.")
    }
}

fun anoBissexto(ano: Int): Boolean{
//verifica se o ano não terminar em 00
  val teste1 = ano % 100 != 0
  //verifica se o ano é divisível por 4
  val teste2 = ano % 4 == 0
  //verifica se o ano é divisível por 4
  val teste3 = ano % 400 == 0

  // se o ano não terminar em 00 e for divisível por 4 dizemos que ele é bissexto.
  // Os anos terminados em 00 serão bissextos se a divisão deles por 400
  if (teste1){
      if(teste2){
          return true
      } else
      if(teste3){
          return true
      }
  }
  return false
}

fun diasMes(mes: Int): Int {
  var qtdDias = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
  return qtdDias[mes-1]
}

fun quantidadeDiasComecoDoAno(dias: Int, mes: Int): Int {
  var somaDias = 0
  var qtdDiasMeses = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

  for(i in 1..(mes-1)){
          somaDias += qtdDiasMeses[i-1]
  }

  return somaDias + dias
}
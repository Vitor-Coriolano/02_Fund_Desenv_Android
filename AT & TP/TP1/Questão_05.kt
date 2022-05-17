/*Calcula o fatorial de um número n. */
/*-------------------------------------------------------------------------------------------------------------- */
fun main() {
    val num = 5
    var fatorial: Long = 1
    for (i in 1..num) {
        fatorial *= i.toLong()
    }
    println("O Fatorial de $num é $fatorial")
}
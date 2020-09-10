class Exercicios(var numero: Int) {


    fun fatorial(numero: Int) {
        var numeroX = numero
        for (i in 1.. numero) {
             numeroX *=  i
        }

          println(numeroX)

    }




}

fun main() {
    val exercicios = Exercicios(5)
    exercicios.fatorial(exercicios.numero)
}
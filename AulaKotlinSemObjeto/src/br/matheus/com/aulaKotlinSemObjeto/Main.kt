package br.matheus.com.aulaKotlinSemObjeto

fun main() {
    println("É maior: " + retornaMaior(5,4,4))
    println("Texto é diferente: " + textoDiferente("uva", "uva"))
    println("É par:" + ePar(6))
    println("Primeiro numeros impares: ")
    primeirosNumerosInteirosImpar()


}

fun retornaMaior(a: Int, b: Int, c: Int): Int {
   return maxOf(a, b, c)
}


fun textoDiferente(textoUm: String, textoDois: String): Boolean {
    return textoUm != textoDois

}

fun ePar(a: Int): Boolean {
    return a % 2 == 0;
}

fun primeirosNumerosInteirosImpar() {
    for (i in 1..200) {
        if (i % 2 != 0) {
            print(i);
            print(", ")
        }
    }
}

fun analisaNumero(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return ((numA > numC && numA > numD) || (numB > numC && numB > numD));
}

fun primeirosNumerosInteiros() {
    for (i in 0..99) {
        println(i)
    }
}
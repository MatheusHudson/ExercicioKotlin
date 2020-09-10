package br.atletaseprova.com

fun main() {
    val atleta1 = Atleta("Jose",90, 99)
    val atleta2 = Atleta("Joana",55, 70)

    val prova1 = Prova(30, 35)
    val prova2 = Prova(55, 70)
    val prova3 = Prova(85, 100)

    prova1.podeRealizar(atleta1);
    prova1.podeRealizar(atleta2);

    prova2.podeRealizar(atleta1);
    prova2.podeRealizar(atleta2);

    prova3.podeRealizar(atleta1);
    prova3.podeRealizar(atleta2);


}

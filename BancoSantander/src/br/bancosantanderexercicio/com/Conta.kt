package br.bancosantanderexercicio.com

class Conta(
        var numeroConta: Int,
        var saldoConta: Double,
        var cliente: Cliente

) {
    fun deposito(valor: Double) {
        saldoConta += valor
        println("Seu deposito foi realizado com sucesso, seu novo saldo é : $saldoConta")

    }

    fun saque(valor: Double) {
        if (valor <= saldoConta) {
            saldoConta -= valor
            println("Seu saque foi realizado com sucesso, seu novo saldo é : $saldoConta")

        } else {
            println("Saldo insuficiente!!!")
        }
    }


}


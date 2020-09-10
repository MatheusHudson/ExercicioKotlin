package br.bancosantanderexercicio.com

 abstract class Conta(
        var numeroConta: Int,
        var saldoConta: Double,
        var cliente: Cliente

) {
    fun deposito(valor: Double) {
        saldoConta += valor
        println("Seu deposito foi realizado com sucesso, seu novo saldo é : $saldoConta")
    }

   abstract fun saque(valor: Double)

   abstract fun consultarSaldo()

 }







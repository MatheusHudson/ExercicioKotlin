package br.bancosantanderexercicio.com

class ContaPoupanca(numeroConta: Int, cliente: Cliente, saldoConta: Double, var juros: Double) :
        Conta(numeroConta, saldoConta, cliente) {

    override fun saque(valor: Double) {
        when {
            valor <= saldoConta -> {
                println("Saque realizado com sucesso! Seu novo saldo é $saldoConta ")
                saldoConta -= valor
            }

            else -> println("Saldo insuficiente!!! ")

        }
    }

    override fun consultarSaldo() {
        println("O seu saldo é : $saldoConta")

    }

    fun recolherJuros() {
        var calc = saldoConta * juros
        saldoConta -= calc
        println("Você recolheu R$: $calc de juros mensal!")
        consultarSaldo()
    }

}
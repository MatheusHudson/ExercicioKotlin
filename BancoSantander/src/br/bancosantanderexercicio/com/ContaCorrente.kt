package br.bancosantanderexercicio.com

class ContaCorrente(numeroConta: Int,cliente: Cliente, saldoConta:Double, var chequeEspecial: Double) :
        Conta(numeroConta,saldoConta,cliente) {


    override fun saque(valor: Double) {
        when {
            valor <= saldoConta -> {
                println("Saque realizado com sucesso! Seu novo saldo  é $saldoConta")
                saldoConta -= valor
            }
            valor > saldoConta && valor <= saldoConta + chequeEspecial -> {
                println("Saque realizado utilizando o cheque especial! Seu novo saldo  é $saldoConta")
                saldoConta -= valor
                chequeEspecial -= saldoConta
                saldoConta = 0.0
            } else -> {
            println("Saldo insuficiente!")
        }

        }
    }

    override fun consultarSaldo() {

        println("Seu saldo é $saldoConta e seu limite de cheque especial é $chequeEspecial")

    }

    fun depositarCheque(cheque: Cheque) {
        saldoConta += cheque.valor
        print("Você depositou um cheque do banco ${cheque.bancoEmissor}  ")
        consultarSaldo()

    }
}
package br.bancosantanderexercicio.com

fun main() {

    val cliente1 = Cliente(1,"José","Fonseca","MG-1452132","024.545.458-66")

    val contaPoupanca1 = ContaPoupanca(1560,cliente1,8000.00,0.024)
    val contaCorrente1 = ContaCorrente(1560,cliente1,8000.00,500.00)
    val cheque1 = Cheque(500.0,"Santander","09/09/2020")

    contaCorrente1.saque(500.0)
    contaCorrente1.consultarSaldo()
    contaCorrente1.depositarCheque(cheque1)
    contaCorrente1.deposito(1000.0)



//    contaPoupanca1.consultarSaldo()
//    contaPoupanca1.saque(550.00)
//    contaPoupanca1.deposito(550.00)
//    contaPoupanca1.recolherJuros()


}






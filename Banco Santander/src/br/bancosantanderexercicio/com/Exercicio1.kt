package br.bancosantanderexercicio.com

fun main() {
    val cliente1 = Cliente("Josevaldo", "Martins")
    val cliente2 = Cliente("Maria", "Silva")

    val conta1 = Conta(1, 100.0, cliente1)
    val conta2 = Conta(2, 50.0, cliente2)

    conta1.deposito(200.0)
    conta2.deposito(50.0)

    conta1.saque(150.0)
    conta2.saque(500.0)
}






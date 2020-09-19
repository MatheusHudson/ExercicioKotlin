fun main () {
    val peca1 = Pecas("Lagost","Camiseta")
    val peca2 = Pecas("FidoDido","Blusa")
    val peca3 = Pecas("Jeans","Calça")


    val guarda = GuardaVolumes(
           mutableMapOf(), 0)

    guarda.guardaPecas(mutableListOf(peca1,peca2,peca3))

    guarda.mostrapecas()
    guarda.mostrapecas(0)

    guarda.devolverPeca(0)

}
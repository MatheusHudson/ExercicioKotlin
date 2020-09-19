class GuardaVolumes(val dicionario: MutableMap<Int, MutableList<Pecas>>, var i: Int) {

    fun guardaPecas(listaDePecas: MutableList<Pecas>): Int {


        dicionario.put(i, listaDePecas)
        return i++
    }

    fun mostrapecas() = dicionario.forEach { println(it) }

    fun mostrapecas(chave: Int) = println(dicionario[chave])

    fun devolverPeca(chave: Int) {
        dicionario.remove(chave)
        println("Peça devolvida com sucesso!")
    }


}
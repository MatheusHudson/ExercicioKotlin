package br.atletaseprova.com

class Prova(
        var dificuldade: Int,
        var energiaNecessaria: Int
) {
    fun podeRealizar(atleta: Atleta) : Boolean {

        if(atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria) {
            println("Pode realizar a prova ${atleta.nome}")
        } else {
            println("Não pode realizar a prova ${atleta.nome}")
        }

        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
    }




}
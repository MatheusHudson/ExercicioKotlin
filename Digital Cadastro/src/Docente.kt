interface Docente {
    fun darAula(curso: Curso) {
        println("Estou dando aula para o ${curso.nome}")
    }

    fun fazerChamada(curso: Curso) {
        println("Estou fazendo a chamada do  ${curso.nome}")
    }
}

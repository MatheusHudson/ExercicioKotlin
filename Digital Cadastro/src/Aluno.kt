class Aluno(val ra: Int, var nome: String, var sobrenome: String )  {


    fun assistirAulas(materia: Disciplina) {
        println("Estou assistindo a aula de ${materia.nome} ")
    }
    fun fazerLicao(materia: Disciplina) {
        println("Estou fazendo a lição de ${materia.nome}")
    }
}
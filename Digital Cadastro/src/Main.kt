fun main() {
    val professor = Professor(1546410,"Kaio", "Avelar")

    val matematica = Disciplina("Matematica")
    val ingles = Disciplina("Inglês")
    val portugues = Disciplina("Português")

    val aula1 = Aula(matematica,"17/18")
    val aula2 = Aula(ingles,"18/19")
    val aula3 = Aula(matematica,"19/20")


    val aluno1 = Aluno(154121,"Lucas","Damião")
    val aluno2 = Aluno(154121,"Joana","Silva")
    val aluno3 = Aluno(154121,"Murilo","Alencar")



    var listaAluno = mutableListOf<Aluno>(aluno1,aluno2, aluno3)
    var listaAula = mutableListOf<Aula>(aula1,aula2, aula3)


    val cursoAndroid = Curso("Andorid",listaAula,professor,listaAluno,)


    aluno1.assistirAulas(ingles)
    aluno2.fazerLicao(matematica)

    professor.darAula(cursoAndroid)
    professor.fazerChamada(cursoAndroid)


}

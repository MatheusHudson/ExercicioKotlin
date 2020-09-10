package br.jogadoresetreino.com

class SessaoDeTreinamento   () {
    var experiencia: Int = 1

    fun treinarA(jogador: JogadorDeFutebol) {
            jogador.correr()
            jogador.fazerGol()
            jogador.correr()
            println("Experiência Inicial: ${jogador.experiencia}")
            jogador.experiencia += experiencia
            println("Experiência Final: ${jogador.experiencia}")
    }
}
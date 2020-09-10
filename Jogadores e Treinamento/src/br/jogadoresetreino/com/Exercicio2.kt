package br.jogadoresetreino.com
fun main() {
    val jogador1 = JogadorDeFutebol("Jackson", 100, 50,0,50 )
    val jogador2 = JogadorDeFutebol("Jackson", 80, 30,0,80 )

    val sessao = SessaoDeTreinamento()

    sessao.treinarA(jogador1)
    sessao.treinarA(jogador2)
    

}
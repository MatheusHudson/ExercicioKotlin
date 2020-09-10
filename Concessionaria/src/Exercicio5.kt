fun main(args: Array<String>) {
  val veiculo = Veiculo("Honda","Civic","2019", "preta","13.718" )
  val cliente = Cliente("Caio","Fonseca","caiofon@contato.com.br")
  val concessionaria = Concessionaria()

  concessionaria.registrarVenda(veiculo,cliente,65985.00)


}
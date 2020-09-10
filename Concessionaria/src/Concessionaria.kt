class Concessionaria() {

fun registrarVenda(veiculo: Veiculo,
cliente: Cliente, valor: Double) {
  
  val venda = Venda(cliente, veiculo, valor)


  println("Venda realizada com sucesso!")
  println("Nome do cliente: ${venda.cliente.nome + " " + venda.cliente.sobrenome}")
  println("Carro Marca: ${venda.veiculo.marca}  Modelo: ${venda.veiculo.modelo}  Ano: ${venda.veiculo.anoFabricacao}  Cor: ${venda.veiculo.cor} Quilometragem:${venda.veiculo.quilometragem}")

  println("Valor da venda: $valor")

}

}
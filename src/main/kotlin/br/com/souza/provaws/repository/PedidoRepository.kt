package br.com.souza.provaws.repository

import br.com.souza.provaws.model.Pedido
import org.springframework.data.repository.CrudRepository

interface PedidoRepository: CrudRepository<Pedido, Long> {
}
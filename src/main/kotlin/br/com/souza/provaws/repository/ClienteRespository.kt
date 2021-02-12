package br.com.souza.provaws.repository

import br.com.souza.provaws.model.Cliente
import org.springframework.data.repository.CrudRepository

interface ClienteRespository : CrudRepository<Cliente, Long> {
}
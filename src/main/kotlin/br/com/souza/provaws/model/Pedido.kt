package br.com.souza.provaws.model

import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Pedido(
    @Id
    @GeneratedValue
    val id: Long,
    val numPedRca: String,
    val numPedERP: String,
    val dataPedido: String,
    val status: String,
    val critica: String,
    val valor: String,
    val cliente: String
)
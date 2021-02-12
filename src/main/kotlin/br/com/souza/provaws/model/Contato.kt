package br.com.souza.provaws.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Contato(

    @Id
    val id: Long,
    val nome: String,
    val telefone: String,
    val celular: String,
    val conjuge: String,
    val tipo: String,
    val time: String,
    val e_mail: String,
    val data_nascimento: String,
    val dataNascimentoConjuge: String
)

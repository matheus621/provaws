package br.com.souza.provaws.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Cliente(
    @Id
    @GeneratedValue
    val id: Long,
    val codigo: String,
    val razao_social: String,
    val nomeFantasia: String,
    val cpf: String,
    val cnpj: String,
    val ramo_atividade: String,
    val endereco: String,
    val status: String,
    @Embedded
    val contatos: Contato
)

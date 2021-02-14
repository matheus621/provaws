package br.com.souza.provaws.controller

import br.com.souza.provaws.model.Pedido
import br.com.souza.provaws.repository.PedidoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("pedidos")
class PedidoController {

    @Autowired
    lateinit var pedidoRepository: PedidoRepository

    @GetMapping
    fun list(): List<Pedido> {
        return pedidoRepository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody pedido: Pedido): Pedido {
        return pedidoRepository.save(pedido)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long){
        if (pedidoRepository.existsById(id)){
            pedidoRepository.deleteById(id)
        }

    }
}
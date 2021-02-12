package br.com.souza.provaws.controller

import br.com.souza.provaws.model.Cliente
import br.com.souza.provaws.repository.ClienteRespository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("cliente")
class ClienteController {

    @Autowired
    lateinit var clienteRespository: ClienteRespository

    @GetMapping
    fun list(): List<Cliente> {
        return clienteRespository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody cliente: Cliente): Cliente {
        return clienteRespository.save(cliente)
    }

//    @PutMapping("{id}")
//    fun alter(@PathVariable id: Long, @RequestBody cliente: Cliente): Cliente {
//        if (clienteRespository.existsById(id)) {
//            val safeCliente = cliente.copy(id)
//            return clienteRespository.save(safeCliente)
//        }
//        return Cliente()
//    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long){
        if (clienteRespository.existsById(id)){
            clienteRespository.deleteById(id)
        }

    }
}
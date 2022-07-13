package br.com.leonardo.pratica.gerenciadortarefas.controllers

import br.com.leonardo.pratica.gerenciadortarefas.dtos.ErrorDTO
import br.com.leonardo.pratica.gerenciadortarefas.dtos.LoginDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping ("api/login")
class loginController {

    @PostMapping
    fun efetuarLogin(@RequestBody dto : LoginDTO): ResponseEntity<Any>{
        try {
            throw java.lang.RuntimeException("Testando uma Exceção")
        } catch (e: Exception){
            return ResponseEntity(ErrorDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Não foi possível efetuar o login, " +
                    "tente novamente"), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}
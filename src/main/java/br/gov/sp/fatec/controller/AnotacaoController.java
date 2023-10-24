package br.gov.sp.fatec.springboot3app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springboot3app.entity.Anotacao;
import br.gov.sp.fatec.springboot3app.service.AnotacaoService;

@RestController
@RequestMapping(value = "/Anotacao")
@CrossOrigin
public class AnotacaoController {

    @Autowired
    private AnotacaoService service;

    @GetMapping
    public List<Anotacao> todosAnotacaos() {
        return service.todosAnotacaos();
    }

    @PostMapping
    public Anotacao novoAnotacao(@RequestBody Anotacao Anotacao) {
        return service.novoAnotacao(Anotacao);
    }

    @GetMapping(value = "/{id}")
    public List<Anotacao> findByid( Long id) {
        return service.findByid(id);
    }

    
}
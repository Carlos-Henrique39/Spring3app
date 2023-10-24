package br.gov.sp.fatec.springboot3app.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3app.entity.Anotacao;
import br.gov.sp.fatec.springboot3app.repository.AnotacaoRepository;

@Service
public class AnotacaoService {
    
    @Autowired
    private AnotacaoRepository AnotacaoRepo;

    public Anotacao novoAnotacao(Anotacao Anotacao) {
        Anotacao.setDataHoraEntrega(LocalDateTime.now());
        return AnotacaoRepo.save(Anotacao);
    }

    public List<Anotacao> todosAnotacaos() {
        return AnotacaoRepo.findAll();
    }

    public List<Anotacao> findByid(Long id) {
        return AnotacaoRepo.findByid(id);
    }

}
package br.com.rd.exerciciospring.controller;
import br.com.rd.exerciciospring.Repository.CupomRepository;
import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import java.util.List;


@RestController
public class CupomController {

    @Autowired
    private CupomRepository CupomRepository;


    @GetMapping("/cupom/{id_cliente}")
    public List<Cupom> findByCupom(@PathVariable("id_cliente") Long idDoCliente) {
        return CupomRepository.findAll();
    }

    @GetMapping("/cupom/{dt_venda}")
    public Cupom findByCupom(@PathVariable("dt_venda") Long dtVenda) {
        return CupomRepository.findbyCupom(dtVenda).get();
    }

}

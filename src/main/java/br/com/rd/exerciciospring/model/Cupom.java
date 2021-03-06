package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")

public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCupom;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "dt_venda")
    private BigDecimal dtVenda;

    @Column(name = "vl_venda")
    private BigDecimal vlVenda;


}

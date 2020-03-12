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
@Table(name = "tb_cupom_item")

public class cupomItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCupomItem;

    @Column(name = "id_cupom")
    private Long idCupom;

    @Column(name = "id_Produto")
    private Long idProduto;

    @Column(name = "qtd_Pedido")
    private Long qtdProduto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;

}

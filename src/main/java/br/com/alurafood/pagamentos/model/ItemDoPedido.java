package br.com.alurafood.pagamentos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDoPedido {
    //id
    private Long id;
    //quantidade
    private Integer quantidade;
    //descrição
    private String descricao;
}

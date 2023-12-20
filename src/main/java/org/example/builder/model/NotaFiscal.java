package org.example.builder.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private Long codigo;
    private OffsetDateTime dataEmissao;
    private List<Item> itens;

    private BigDecimal valorTotal;

    public NotaFiscal() {
        this.itens = new ArrayList<>();
    }


    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public OffsetDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(OffsetDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    @Override
    public String toString() {
        return "NotaFiscal{" + "\n" +
                "codigo=" + codigo + "\n" +
                ", dataEmissao=" + dataEmissao + "\n" +
                ", itens=" + itens + "\n" +
                ", valorTotal=" + valorTotal + "\n" +
                '}';
    }
}

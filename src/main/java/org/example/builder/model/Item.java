package org.example.builder.model;

import java.math.BigDecimal;

public class Item {
    private String descricao;
    private int quantidade;
    private BigDecimal valor;

    public Item(){}

    public Item(String nome, int quantidade, BigDecimal valor) {
        this.descricao = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }

    public static class ItemBuilder{
        private Item item;

        public ItemBuilder(){
            this.item = new Item();
        }

        public ItemBuilder descricao(String descricao){
            this.item.setDescricao(descricao);
            return this;
        }

        public ItemBuilder quantidade(int quantidade){
            this.item.setQuantidade(quantidade);
            return this;
        }

        public ItemBuilder valor(Double valor){
            this.item.setValor(BigDecimal.valueOf(valor));
            return this;
        }

        public ItemBuilder valor(String valor){
            this.item.setValor(new BigDecimal(valor));
            return this;
        }

        public Item build(){
            return this.item;
        }
    }
}

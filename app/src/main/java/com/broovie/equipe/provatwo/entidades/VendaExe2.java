package com.broovie.equipe.provatwo.entidades;

public class VendaExe2 {
    private String nomeProduto;
    private int qtd;
    private Double preco;

    public VendaExe2(){

    }

    public VendaExe2(String nomeProduto, int qtd, Double preco) {
        this.nomeProduto = nomeProduto;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

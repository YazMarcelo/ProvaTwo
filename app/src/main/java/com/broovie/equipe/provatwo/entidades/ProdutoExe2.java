package com.broovie.equipe.provatwo.entidades;

public class ProdutoExe2 {
    private String descricao;
    private Double preco;
    private int codigo;

    public ProdutoExe2(String descricao, Double preco, int codigo) {
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

package com.broovie.equipe.provatwo.entidades;

public class VendaExe1 {
    private String nomeCliente;
    private int qtdPorcas;
    private int qtdParafusos;
    private int qtdArruelas;

    public VendaExe1(String nomeCliente, int qtdPorcas, int qtdParafusos, int qtdArruelas) {
        this.nomeCliente = nomeCliente;
        this.qtdPorcas = qtdPorcas;
        this.qtdParafusos = qtdParafusos;
        this.qtdArruelas = qtdArruelas;
    }

    public int getQtdPorcas() {
        return qtdPorcas;
    }

    public void setQtdPorcas(int qtdPorcas) {
        this.qtdPorcas = qtdPorcas;
    }

    public int getQtdParafusos() {
        return qtdParafusos;
    }

    public void setQtdParafusos(int qtdParafusos) {
        this.qtdParafusos = qtdParafusos;
    }

    public int getQtdArruelas() {
        return qtdArruelas;
    }

    public void setQtdArruelas(int qtdArruelas) {
        this.qtdArruelas = qtdArruelas;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}

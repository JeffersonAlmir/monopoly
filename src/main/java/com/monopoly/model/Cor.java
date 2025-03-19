package com.monopoly.model;

public enum Cor {
    PRETO("preto"),
    BRANCO("branco"),
    VERMELHO("vermelho"),
    VERDE("verde"),
    AZUL("azul"),
    AMARELO("amarelo"),
    LARANJA("laranja"),
    ROSAV("rosa");

    private final String valor;

    Cor(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

package com.monopoly.model;

public class Peao {
    private Cor cor;
    private int posicaoTabuleiro;
    private String nomeLugar;

    public Peao (Cor cor){
        this.cor = cor;
        this.posicaoTabuleiro = 0;
        this.nomeLugar = "Go";
    }

    public Cor getCor() {
        return cor;
    }

    public String getCorValor() {
        return cor.getValor();
    }

    public int getPosicaoTabuleiro() {
        return posicaoTabuleiro;
    }

    public void setPosicaoTabuleiro(int posicaoTabuleiro) {
        this.posicaoTabuleiro = posicaoTabuleiro;
    }

    public void setNomeLugar(String nomeLugar) {
        this.nomeLugar = nomeLugar;
    }

    public String getNomeLugar(){
        return nomeLugar;
    }
    
    

}

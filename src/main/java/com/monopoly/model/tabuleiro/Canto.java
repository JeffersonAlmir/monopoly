package com.monopoly.model.tabuleiro;

public abstract class Canto implements Lugar {

    private String nome;

    public Canto(String nome) {
        this.nome = nome;
    }



    @Override
    public String getNome() {
        return nome;
    }

    
}

package com.monopoly.model.tabuleiro;

import java.util.Scanner;

import com.monopoly.model.Jogador;

public class CantoGo extends Canto{
    private int recompensa;

    public CantoGo(String nome) {
        super(nome);
        this. recompensa = 200;
    }

    @Override
    public void realizarAcao(Jogador jogador,Scanner sc) {
        jogador.receberValor(recompensa);
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    
}

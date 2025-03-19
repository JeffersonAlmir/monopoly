package com.monopoly.model.tabuleiro;

import java.util.Scanner;

import com.monopoly.model.Jogador;

public class CantoGoToJail extends Canto {

    private int posicaoJail;

    public CantoGoToJail(String nome) {
        super(nome);
        this.posicaoJail = 10;
    }



    @Override
    public void realizarAcao(Jogador jogador, Scanner sc) {
        jogador.setPosicaoTabuleiro(posicaoJail);
    }

    public int getPosicaoJail() {
        return posicaoJail;
    }
    
}

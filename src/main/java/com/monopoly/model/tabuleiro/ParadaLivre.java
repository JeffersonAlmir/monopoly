package com.monopoly.model.tabuleiro;

import java.util.Scanner;

import com.monopoly.model.Jogador;

public class ParadaLivre implements Lugar {
    
    private String nome;

    public ParadaLivre(String nome) {
        this.nome = nome;
    }


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void realizarAcao(Jogador jogador, Scanner sc) {
        System.out.println("ainda não faz nada");
    }
    
}

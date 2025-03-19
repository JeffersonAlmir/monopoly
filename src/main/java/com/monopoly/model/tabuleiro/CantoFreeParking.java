package com.monopoly.model.tabuleiro;

import java.util.Scanner;

import com.monopoly.model.Jogador;

public class CantoFreeParking extends Canto {

    public CantoFreeParking(String nome) {
        super(nome);
    }



    @Override
    public void realizarAcao(Jogador jogador, Scanner sc) {
        System.out.println(jogador.getNome() + " está no Free Parking. Nada acontece.");
    }
    
}

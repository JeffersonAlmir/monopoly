package com.monopoly.model.tabuleiro;

import java.util.Scanner;

import com.monopoly.model.Jogador;

public interface Lugar {
    
    String getNome();
    void realizarAcao(Jogador jogador, Scanner sc);
    
}

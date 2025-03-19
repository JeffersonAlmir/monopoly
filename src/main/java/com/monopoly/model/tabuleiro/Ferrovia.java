package com.monopoly.model.tabuleiro;

import java.util.Scanner;

import com.monopoly.model.Jogador;

public class Ferrovia extends Casa {

    public Ferrovia(String nome) {
        super(nome, 200, 25, ChaveGrupo.FERROVIA);
    }


    

   

    @Override
    public int valorAluguel(int quantidadeDoMsmTipo) {
        return quantidadeDoMsmTipo * this.getAluguel() ;
    }

    @Override
    public void realizarAcao(Jogador jogador,Scanner sc) {
       System.out.println("Ferrovia ainda não faz nada");
    }

    
     



}

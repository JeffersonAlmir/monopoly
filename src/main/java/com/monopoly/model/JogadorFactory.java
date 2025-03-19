package com.monopoly.model;

import java.util.List;
import java.util.Scanner;

public class JogadorFactory {
    private Scanner sc;
    private List<Cor> coresList;
    
    public JogadorFactory(Scanner sc,List<Cor> coresList){
        this.sc = sc;
        this.coresList = coresList;
    }


    public Jogador criarJogador(int indiceJogador){
        System.out.printf("Entre com o nome do jogador no. %d :%n", indiceJogador); 
        String nomeJogador = sc.nextLine();
        Cor corEscolhida = null;

        while (corEscolhida == null) {
            System.out.printf("Escolha a cor do peão do jogador no. %d entre as opções seguintes:\n", indiceJogador);
            for (Cor cor : coresList) {
                System.out.print("[" + cor.getValor() + "] ");
            }
            System.out.println();

            String corInput = sc.nextLine();
            for (Cor cor : coresList) {
                if (cor.getValor().equalsIgnoreCase(corInput)) {
                    corEscolhida = cor;
                    break;
                }
            }

            if (corEscolhida == null) {
                System.out.println("Cor inválida ou já escolhida. Tente novamente.");
            } else {
                
                coresList.remove(corEscolhida);
            }
            
        }
       
        Peao peao = new Peao(corEscolhida);
        return new Jogador(nomeJogador, peao);

    }

    
}

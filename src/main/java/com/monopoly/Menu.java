package com.monopoly;

import java.util.Scanner;

import com.monopoly.model.Jogador;

public class Menu {

    public int coletaDeDados(Scanner sc){

        int numeroDeJogadores = 0;
        System.out.println("Bem-vindo ao jogo monopoly!");
        
        while (true) { 
            System.out.print("\nEntre com o número de jogadores [2-8]: ");
            try {
                numeroDeJogadores = sc.nextInt();
                sc.nextLine();
                if (numeroDeJogadores >= 2 && numeroDeJogadores <=8){
                    break;
                }
                System.out.println("\nNúmero Inválido. Verifique se o número está dentro do intervalo");
          
            } catch (Exception e) {
                System.out.println("\nEntrada inválida. Digite um número entre 2 e 8.");
                sc.nextLine();
            }

           
        }
          
        return numeroDeJogadores;
    }

    public String status (Jogador jogadorVez){
        StringBuilder dadosJogador = new StringBuilder();
        
        dadosJogador.append("\n").append("O status de ").append(jogadorVez.getNome()).append(" - ");
        dadosJogador.append(jogadorVez.getCorString()).append(" é o seguinte:").append("\n");
        dadosJogador.append("Situado na posição ").append(jogadorVez.getPosicaoTabuleiro()).append(" - ");
        dadosJogador.append(jogadorVez.getNomeLugar()).append("\n");
        dadosJogador.append(jogadorVez.mostraPropriedades());

        //falta o nome do local

        return dadosJogador.toString();
    }

    public boolean sair(Scanner sc){
        System.out.println("Você tem certeza se quer sair? (sim ou nao)");
        String yesOrNo = sc.nextLine();
                        
        if(yesOrNo.equalsIgnoreCase("sim")|| yesOrNo.equalsIgnoreCase("s")){

            return true;                     
        }
        else if ("nao".equalsIgnoreCase(yesOrNo) || "n".equalsIgnoreCase(yesOrNo)) {
            return false;
        }
        else {
        System.out.println("Entrada inválida. Por favor, responda com 'sim' ou 'nao'.");
        } 
        return false;
    }
    
}

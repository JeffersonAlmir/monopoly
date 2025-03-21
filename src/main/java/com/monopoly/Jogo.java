package com.monopoly;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import com.monopoly.model.Cor;
import com.monopoly.model.Dado;
import com.monopoly.model.Jogador;
import com.monopoly.model.JogadorFactory;
import com.monopoly.model.tabuleiro.Lugar;
import com.monopoly.model.tabuleiro.Tabuleiro;


public class Jogo {
    private Queue<Jogador> filaJogadores; 
    private Menu menu;
    private Scanner sc;
    private JogadorFactory jogadorFactory;
    private List<Cor> coresList;
    private Dado dado;
    private Tabuleiro tabuleiro;



    public Jogo(){
        this.filaJogadores = new LinkedList<>();
        this.menu = new Menu();
        this.sc = new Scanner(System.in);
        this.coresList = new ArrayList<>();
        this.dado = new Dado();

        for(Cor cor : Cor.values()){
            coresList.add(cor);
        }

        this.jogadorFactory = new JogadorFactory(sc, coresList);
        this.tabuleiro = new Tabuleiro();
        iniciarTabuleiro();
    }


    public void start(){
        // useStory 1
       int numeroDeJogadores = menu.coletaDeDados(sc);

        for(int i = 1; i <= numeroDeJogadores; i++){
            Jogador jogador = jogadorFactory.criarJogador(i);
            filaJogadores.add(jogador);  

        }
        System.out.println("O jogo Monopoly foi iniciado!\n");

        //useStory 2
        while(filaJogadores.size()> 1){

            boolean continua = true;
            Jogador jogadorVez = filaJogadores.peek();
            System.out.println("A jogada de "+ jogadorVez.getNome()+ " começou.");

            do{
                
                System.out.println("Comandos disponíveis: [jogar] [status] [sair]");
                String comando = sc.nextLine();

                //usa map padrao comand
                switch ( comando) {

                    case "status":
                        System.out.println(menu.status(jogadorVez));
                        break;
                    case "sair":

                        boolean jogoEncerrado = menu.sair(sc);
                        if(jogoEncerrado){
                            Jogador jogadorRemovido = filaJogadores.poll();
                            liberarPropriedade(jogadorRemovido); 

                            if(filaJogadores.size() <2){
                                System.out.println("Jogo encerrado");
                                return;
                            }
                        }
                    
                        break;
                    case "jogar":
                        continua = false;

                        break;
                    default:
                        System.out.println("Opção inválida");
                }

            } while(continua);

            int valor1 = lancarDado();
            int valor2 = lancarDado();

            moverJogador(jogadorVez, valor1, valor2);
            trocarVez(); 
        }  
        
        sc.close();
    };

    private int lancarDado(){
        return dado.lancarDado();
    }

    private int getJogadorPosicaoTabuleiro( Jogador jogadorVez){
        return jogadorVez.getPosicaoTabuleiro();
    }
    private void setPosicaoJogador(int novaPosicao, Jogador jogadorVez){
        jogadorVez.setPosicaoTabuleiro(novaPosicao);
    }

    private void iniciarTabuleiro(){
        tabuleiro.iniciarLugares();
    }

    private Lugar getLugar(int posicao){
        return tabuleiro.getLugar(posicao);
    }

    private int getTamanhoTabuleiro(){
        return tabuleiro.getTamanhoTabuleiro();
    }

    private void setNomeLugarJogador(Jogador jogadorVez, String lugar){
        jogadorVez.setNomeLugar(lugar);
    }

    private void liberarPropriedade(Jogador jogadorRemovido){
        jogadorRemovido.liberarPropriedade();
    }

    private void trocarVez(){
        Jogador jogador = filaJogadores.poll();
        filaJogadores.add(jogador);
    }

    private void moverJogador(Jogador jogadorVez, int valorDado1, int valorDado2){
        
        if((getJogadorPosicaoTabuleiro(jogadorVez)+ valorDado1 +valorDado2) > getTamanhoTabuleiro()){
            jogadorVez.receberValor(200);
            System.out.println(" Você passou pelo GO e recebeu $200!");
        }

        int posicaoTabuleiro = (valorDado1 + valorDado2 + getJogadorPosicaoTabuleiro(jogadorVez))% getTamanhoTabuleiro();
        Lugar lugar = getLugar(posicaoTabuleiro);

        setPosicaoJogador(posicaoTabuleiro, jogadorVez);
        setNomeLugarJogador(jogadorVez, lugar.getNome());
           
        System.out.printf("O jogador %s tirou %d e %d e o peão avançou para casa %d - %s.%n"
        ,jogadorVez.getNome(),valorDado1 ,valorDado2 ,posicaoTabuleiro, lugar.getNome());

        lugar.realizarAcao(jogadorVez, sc);
        
    }
}

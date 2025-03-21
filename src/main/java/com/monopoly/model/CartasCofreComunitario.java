package com.monopoly.model;

import java.util.Scanner;

import com.monopoly.model.tabuleiro.Lugar;
import com.monopoly.model.tabuleiro.Tabuleiro;

public enum CartasCofreComunitario implements AcaoCarta {
    AVANCE_PARA_O_PONTO_DE_PARTIDA("Avance para o ponto de partida") {
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.setPosicaoTabuleiro(40);
            jogador.receberValor(200);
            System.out.println("Você avançou para o ponto de partida (GO) e recebeu $200!");
        }
    },
    AVANCE_PARA("Avance para Illinois Avenue"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.setPosicaoTabuleiro(24);
            // realizar ação do lugar
        }
    },
    AVANCE_PARA_ST_CHARLES("Avance para St. Charles Place") {
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.setPosicaoTabuleiro(11);

            Lugar novaCasa = getTabuleiro().getLugar(11);

            System.out.println("Você foi para St. Charles Place!%n");
            Scanner sc = new Scanner(System.in);
            novaCasa.realizarAcao(jogador, sc);
            
        }
    },
    AVANCE_PARA_SERVICO_PUBLICO("Avance o peão para o serviço público mais próximo"){
        @Override
        public void executarAcaoCarta(Jogador jogadorVez) {
            
        }
        
    },
    AVANCE_PARA_FERROVIA("Avance o peão para a ferrovia mais próxima"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            
        }
    },
    PAGAMENTO_DIVIDENDO_BANCO("O banco lhe pagou dividendos de"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.receberValor(200);
            System.out.println("O banco pagou dividendo, você recebeu $50");
        }
    },
    VOLTE_3_ESPACOS("Volte 3 espaços"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            int posicaoAtual = jogador.getPosicaoTabuleiro();
            jogador.setPosicaoTabuleiro(posicaoAtual - 3);
            // realizar ação do lugar
        }
    },
    VA_PARA_PRISAO("Vá diretamente para a Prisão"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.setPosicaoTabuleiro(10);
        }
    },
    MANUTECAO_DE_PROPRIEDADE("Faça a manutenção de todas as suas propriedade: casa e hotel"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            
        }
    },
    IMPOSTO_DE_PROBREZA("Pague imposto de pobreza"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.pagarValor(15);
            System.out.println("Você pagou $15, de imposto de probreza.");
        }
    },
    CARTA_SAIR_PRISÃO("Carta sair da prisão"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            
        }
    },
    VOLTA_NA_READ("Dê uma volta na Reading"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            
        }
    },
    CAMINHADA_PARA_BOARD_WALK("Dê uma caminhada no Board Walk"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            
        }
    },
    ELEITO_PRESIDENTE_DO_TABULEIRO("Você foi eleito presidente do tabuleiro"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            
        }
    },
    ANIVERSARIO_DE_EMPRESTIMOS("Seus empréstimos e investimento fizeram aniversário"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
           jogador.receberValor(150);
           System.out.println("Você recebeu $150 de anivésario de empréstimso.");
        }
    };
    

    private final String nome;
    private Tabuleiro tabuleiro;

    CartasCofreComunitario(String nome){
        this.nome = nome;
        this.tabuleiro = tabuleiro;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}

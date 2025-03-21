package com.monopoly.model;

public enum CartasSorteReves implements AcaoCarta {

    AVANCE_PARA_O_INICIO("Avance para o ponto de partida") {
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.setPosicaoTabuleiro(40);
            jogador.receberValor(200);
            System.out.println("Você avançou para o ponto de partida (GO) e recebeu $200!");
        }
    },
    ERRO_DO_BANCO_EM_SEU_FAVOR("Erro do banco em seu favor"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.receberValor(200);
            System.out.println("O banco erro, você recebeu $200");

        }
    },
    TAXA_DO_MEDICO("Taxa do medico") {
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.pagarValor(50);
            System.out.println("Você pagou 50 ao médico.");
        }
    },
    ABERTURA_DA_GRANDE_OPERA("Abertura da grande Ópera"){
        @Override
        public void executarAcaoCarta(Jogador jogadorVez) {
            /*for(Jogador jogador: filaJogadore) {}
                if( !jogadoreVez.equals(jogador)){
                    jogador.setValor(50);
                    jogadorVez.recebeValor(50);
                }
            */
        }
        
    },
    DA_LIQUIDACAO_FORA_DE_ESTOQUE("Da liquidação fora do estoque"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.receberValor(50);
            System.out.println("Você recebeu $50 da liquidação!");
        }
    },
    SAIR_LIVRE_DA_PRISÃO_SEM_PAGAR("Saia livre da prisão, sem pagar"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            
        }
    },
    VA_PARA_A_PRISAO("Vá para a prisão"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            
        }
    },
    RESTITUICAO_DO_IMPOSTO_DE_RENDA("Restituição do imposto de renda"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.receberValor(20);
            System.out.println("Você recebeu $20 da restituição do imposto de renda!");
        }
    },
    ANIVERSARIO_DO_SEGURO_DE_SEGURO("Aniversario de  seguro de vida"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.receberValor(100);
            System.out.println("Você recebeu $100 do aniversario de  seguro de vida!");
        }
    },
    PAGUE_O_HOSPITAL("Pague o hospital"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.pagarValor(100);
            System.out.println("Você pagou $100 ao hospital.");
        }
    },
    PAGUE_A_TAXA_DE_ESCOLA("Paque a taxa de escola"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.pagarValor(150);
            System.out.println("Você pagou $150 de taxa de escola.");
        }
    },
    RECEBA_POR_SEUS_SERVICO("Receba por serviço"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.receberValor(25);
            System.out.println("Você recebeu $25 por seu serviço!");
        }
    },
    ANIVERSARIO_DOS_FUNDOS_DE_NATAL("Aniversário dos fundos de Natal"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.receberValor(100);
            System.out.println("Você recebeu $100 de aniversário dos fundos de Natal!");
        }
    },
    SEGUNDO_LUGAR_CONCURSO_DE_BELEZA("Você tirou o segundo lugar no concurso de beleza"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.receberValor(10);
            System.out.println("Você recebeu $10 do segundo lugar no concurso de beleza!");
        }
    },
    VOCE_HERDOU("Você herdou"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            jogador.receberValor(100);
            System.out.println("Você recebeu $100 de herança!");
        }
    },
    VOCE_DEVE_PAGAR_REPAROS_DA_RUA("Você deve pagar os reparos da rua"){
        @Override
        public void executarAcaoCarta(Jogador jogador) {
            // fazer ainda
        }
    };

    private final String nome;

    CartasSorteReves(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

}

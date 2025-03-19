package com.monopoly.model;

public enum CartasSorte implements AcaoCarta {

    AVANCE_PARA_O_INICIO("Avance para o ponto de partida") {
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    ERRO_DO_BANCO_EM_SEU_FAVOR("Erro do banco em seu favor"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    TAXA_DO_MEDICO("Taxa do medico") {
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    ABERTURA_DA_GRANDE_OPERA("Abertura da grande Ópera"){
        @Override
        public void executarAcao(Jogador jogadorVez) {
            /*for(Jogador jogador: filaJogadore) {}
                if( !jogador.equals(jogador)){
                    jogador.setValor(50);
                    jogador.recebeValor(50);
                }
            */
        }
        
    },
    DA_LIQUIDACAO_FORA_DE_ESTOQUE("Da liquidação fora do estoque"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    SAIR_LIVRE_DA_PRISÃO_SEM_PAGAR("Saia livre da prisão, sem pagar"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    VA_PARA_A_PRISAO("Vá para a prisão"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    RESTITUICAO_DO_IMPOSTO_DE_RENDA("Restituição do imposto de renda"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    ANIVERSARIO_DO_SEGURO_DE_SEGURO("Aniversario de  seguro de vida"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    PAGUE_O_HOSPITAL("Pague o hospital"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    PAGUE_A_TAXA_DE_ESCOLA("Paque a taxa de escola"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    RECEBA_POR_SEUS_SERVICO("Receba por serviço"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    ANIVERSARIO_DOS_FUNDOS_DE_NATAL("Aniversário dos fundos de Natal"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    SEGUNDO_LUGAR_CONCURSO_DE_BELEZA("Você tirou o segundo lugar no concurso de beleza"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    VOCE_HERDOU("Você herdou"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    },
    VOCE_DEVE_PAGAR_REPAROS_DA_RUA("Você deve pagar os reparos da rua"){
        @Override
        public void executarAcao(Jogador jogador) {
            
        }
    };

    private final String nome;

    CartasSorte(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

}

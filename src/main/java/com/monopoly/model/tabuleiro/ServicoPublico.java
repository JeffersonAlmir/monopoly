package com.monopoly.model.tabuleiro;

import com.monopoly.model.Dado;

public class ServicoPublico extends Casa{

    public ServicoPublico(String nome) {
        super(nome, 150, 0,ChaveGrupo.SERVICO);
    }

    @Override
    public int valorAluguel(int numPropriedades){
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int valorDados = dado1.lancarDado() + dado2.lancarDado();

        int multiplicador = numPropriedades == 2 ? 10 : 4;
        return valorDados * multiplicador;
    }
}

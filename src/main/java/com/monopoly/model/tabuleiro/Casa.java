package com.monopoly.model.tabuleiro;

import java.util.Scanner;

import com.monopoly.model.Jogador;

public abstract class Casa implements Lugar {
    
    private String nome;
    private int preco;
    private int aluguel;
    private Jogador dono;
    private ChaveGrupo chaveGrupo;

    public Casa(String nome, int preco,int aluguel, ChaveGrupo chaveGrupo) {
        this.nome = nome;
        this.preco = preco;
        this.aluguel = aluguel;
        this.dono = null;
        this.chaveGrupo = chaveGrupo;
    }



    @Override
    public String getNome() {
        return this.nome;
    }


    public ChaveGrupo getChaveGrupo() {
        return chaveGrupo;
    }

    public int getAluguel() {
        return aluguel;
    }


    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }

    public void setDono(Jogador dono) {
        this.dono = dono;
    }
    
    @Override
    public void realizarAcao(Jogador jogador, Scanner sc) {
        if (this.getDono() == null) {
            System.out.printf("\nO título da propriedade %s está disponível por $%d.%n", this.getNome(), this.getPreco());
            System.out.printf("%s, você possui $%d.%n", jogador.getNome(), jogador.getSaldo());
            System.out.printf("Você deseja comprar %s (Sim/Não)? ", this.getNome());
    
            
            String resposta = sc.nextLine();
    
            if (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")) {
                jogador.comprarPropriedade(this);
            }
        } else if (!this.getDono().equals(jogador)) {
            System.out.printf("Você chegou em %s, que pertence a %s.%n", this.getNome(), this.getNomeDono());
    
            jogador.pagarAluguel(this, this.getDono());
        } else {
            System.out.printf("%s já é dono de %s.%n", jogador.getNome(), this.getNome());
        }
    }
    


    public int valorAluguel(int quantidadePropriedadeMsmCor){
        if(quantidadePropriedadeMsmCor == 3){
            return 2 * this.aluguel;
        }
        return this.aluguel;
    }

    public int getPreco() {
        return preco;
    }

    public Jogador getDono() {
        return dono;
    }
    public String getNomeDono(){
        return dono.getNome();
    }
    
    
}

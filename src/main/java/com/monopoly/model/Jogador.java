package com.monopoly.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.monopoly.model.tabuleiro.Casa;
import com.monopoly.model.tabuleiro.ChaveGrupo;



public class Jogador {
    private String nome;
    private Peao peao;
    private Carteira carteira;
    private Map<ChaveGrupo, List<Casa>> minhasPropriedades;

    public Jogador(String nome, Peao peao) {
        this.carteira = new Carteira(1500);
        this.nome = nome;
        this.peao = peao;
        this.minhasPropriedades = new HashMap<>();
        
    }

    public String getNome() {
        return nome;
    }

    public Peao getPeao() {
        return peao;
    }

    public int getSaldo(){
        return carteira.getSaldo();
    }

    public void setSaldo(int saldo) {
        carteira.setSaldo(saldo);
    }

    public int getPosicaoTabuleiro(){
        return peao.getPosicaoTabuleiro();
    }
    public void setPosicaoTabuleiro(int posicaoTabuleiro){
        peao.setPosicaoTabuleiro(posicaoTabuleiro);
    }
    public String getCorString(){
        return peao.getCorValor();
    }

    public void setNomeLugar(String lugar ){
        peao.setNomeLugar(lugar);
    }

    public String getNomeLugar(){
        return peao.getNomeLugar();
    }

    public void addPropriedades(Casa propriedade){
        minhasPropriedades.computeIfAbsent(propriedade.getChaveGrupo(), k -> new ArrayList<>())
            .add(propriedade);
    }
    
    public String mostraPropriedades(){

        StringBuilder titulo = new StringBuilder();
        titulo.append("Títulos: \n");
        for(Map.Entry<ChaveGrupo, List<Casa>> par: minhasPropriedades.entrySet() ){
            titulo.append("[");
            List<Casa> listCasas = par.getValue();

            for (int i = 0; i < listCasas.size(); i++) {
                titulo.append(listCasas.get(i).getNome());
                if (i < listCasas.size() - 1) { 
                    titulo.append(", "); 
                }
            }
            titulo.append("] - ").append("proriedade ").append(par.getKey()).append("\n ");
            
        }
        return titulo.toString();
    }

    public int contarPropriedadesDoGrupo(Casa casa) {
        int contador= 0;
        for(Map.Entry<ChaveGrupo, List<Casa>> par: minhasPropriedades.entrySet() ){
            if(casa.getChaveGrupo().equals(par.getKey() )){
                List<Casa> listCasas = par.getValue();
                contador= listCasas.size();
                break;
            }
        }
        return contador;
    }
    

    public void receberValor(int valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
    

    public void pagarAluguel(Casa casa, Jogador dono) {
        int numPropriedades = contarPropriedadesDoGrupo(casa);
        int valorAluguel = casa.valorAluguel(numPropriedades);
    
        if (this.getSaldo() >= valorAluguel) {
            this.setSaldo(this.getSaldo() - valorAluguel);
            dono.receberValor(valorAluguel);
            System.out.println("Você pagou aluguel de $" + valorAluguel);
        } else {
            System.out.println(this.nome + " não tem dinheiro suficiente para pagar o aluguel.");
            
        }
    }
    
    public void liberarPropriedade(){
        for(List<Casa> casas : minhasPropriedades.values()){
            for(Casa casa : casas){
                casa.setDono(null);
            }
        }
        
    }
    
    public void comprarPropriedade(Casa casa){
        if (this.getSaldo() < casa.getPreco() ) {
            System.out.println("Saldo insuficiente para comprar " + casa.getNome() + ".");
            return;
        }
        this.carteira.setSaldo(this.getSaldo() - casa.getPreco());
        casa.setDono(this);
        this.addPropriedades(casa);
        System.out.println(this.getNome() + " comprou " + casa.getNome());
        System.out.println(this.getNome() +", você possui $"+this.getSaldo()+"\n");
    }

    public void pagarValor(int valor){
        this.setSaldo(this.getSaldo() - valor);
    }
}
    
package com.monopoly.model.tabuleiro;

import java.util.HashMap;
import java.util.Map;

public class Tabuleiro {
    
    private final Map<Integer,Lugar> lugares;


    public Tabuleiro (){
        this.lugares =  new HashMap<>();
    }

    public void iniciarLugares(){
        lugares.put(1, new Propriedade("Mediterranean Avenue",60,2,ChaveGrupo.ROXO));
        lugares.put(2, new ParadaLivre("Community Chest 1"));
        lugares.put(3, new Propriedade("Baltic Avenue",60, 4,ChaveGrupo.ROXO));
        lugares.put(4, new ParadaLivre("Income Tax"));
        lugares.put(5, new Ferrovia("Reading Railroad"));
        lugares.put(6, new Propriedade("Oriental Avenue",100, 6,ChaveGrupo.AZULCLARO));
        lugares.put(7, new ParadaLivre("Chance 1"));
        lugares.put(8, new Propriedade("Vermont Avenue",100, 6,ChaveGrupo.AZULCLARO));
        lugares.put(9, new Propriedade("Connecticut Avenue",120,8,ChaveGrupo.AZULCLARO));
        lugares.put(10, new CantoJail("Jail"));
        lugares.put(11, new Propriedade("St. Charles Place",140,10,ChaveGrupo.ROSA));
        lugares.put(12, new ServicoPublico("Electric Company")); // companhia eletrica
        lugares.put(13, new Propriedade("States Avenue",140,10,ChaveGrupo.ROSA));
        lugares.put(14, new Propriedade("Virginia Avenue",160,12,ChaveGrupo.ROSA));
        lugares.put(15, new Ferrovia("Pennsylvania Railroad"));
        lugares.put(16, new Propriedade("St. James Place",180,14,ChaveGrupo.LARANJA));
        lugares.put(17, new ParadaLivre("Community Chest 2"));
        lugares.put(18, new Propriedade("Tennessee Avenue",180,14,ChaveGrupo.LARANJA));
        lugares.put(19, new Propriedade("New York Avenue",200,16,ChaveGrupo.LARANJA));
        lugares.put(20, new CantoFreeParking("Free Parking"));
        lugares.put(21, new Propriedade("Kentucky Avenue",220,18,ChaveGrupo.VERMELHO));
        lugares.put(22, new ParadaLivre("Chance 2"));
        lugares.put(23, new Propriedade("Indiana Avenue",220,18,ChaveGrupo.VERMELHO));
        lugares.put(24, new Propriedade("Illinois Avenue",240,20,ChaveGrupo.VERMELHO));
        lugares.put(25, new Ferrovia("B & O Railroad"));
        lugares.put(26, new Propriedade("Atlantic Avenue",260,22,ChaveGrupo.AMARELO));
        lugares.put(27, new Propriedade("Ventnor Avenue",260,22,ChaveGrupo.AMARELO));
        lugares.put(28,new ServicoPublico("Water Works") ); //companhia de agua
        lugares.put(29, new Propriedade("Marvin Gardens",280,24,ChaveGrupo.AMARELO));
        lugares.put(30, new CantoGoToJail ("Go To Jail"));
        lugares.put(31, new Propriedade("Pacific Avenue",300,26,ChaveGrupo.VERDE));
        lugares.put(32, new Propriedade("North Carolina Avenue",300,26,ChaveGrupo.VERDE));
        lugares.put(33, new ParadaLivre("Community Chest 3"));
        lugares.put(34, new Propriedade("Pennsylvania Avenue",320,28,ChaveGrupo.VERDE));
        lugares.put(35, new Ferrovia("Short Line Railroadv"));
        lugares.put(36, new ParadaLivre("Chance 3"));
        lugares.put(37, new Propriedade("Park Place",350,35, ChaveGrupo.AZUL));
        lugares.put(38, new ParadaLivre("'Luxury Tax"));
        lugares.put(39, new Propriedade("Boardwalk",400,50,ChaveGrupo.AZUL));
        lugares.put(40,new CantoGo("Go") );
    }

    public Lugar getLugar(int posicao){
        return lugares.get(posicao);
    }
    
    public int getTamanhoTabuleiro(){
        return lugares.size();
    }

    
}

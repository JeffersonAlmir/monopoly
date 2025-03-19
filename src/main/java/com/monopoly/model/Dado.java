package com.monopoly.model;

import java.util.Random;

public class Dado {
    public int lancarDado(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}

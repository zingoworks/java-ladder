package com.zingoworks.laddergame.domain;

import java.util.Random;

public class Ladder {
    public Boolean[] ladder;
    public int numOfPeople;
    public int numOfSpace;

    Random random = new Random();

    public Ladder (int numOfPeople) {
        this.numOfPeople = numOfPeople;
        this.numOfSpace = numOfPeople - 1;
        ladder = new Boolean[numOfSpace];
        setLadder();
    }

    public void setLadder () {
        for (int i = 0; i < numOfSpace; i++) {
            ladder[i] = random.nextBoolean();
        }
    }
}

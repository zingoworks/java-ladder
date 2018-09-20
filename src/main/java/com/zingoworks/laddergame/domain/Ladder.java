package com.zingoworks.laddergame.domain;

import java.util.Random;

public class Ladder {
    public Boolean[] ladderValue;
    public int numOfPeople;
    public int maxLadderHeight;

    Random random = new Random();

    public Ladder (int numOfPeople, int maxLadderHeight) {
        this.numOfPeople = numOfPeople;
        this.maxLadderHeight = maxLadderHeight;
        ladderValue = new Boolean[numOfPeople - 1];
        setLadder();
    }

    public void setLadder () {
        for (int i = 0; i < numOfPeople - 1; i++) {
            ladderValue[i] = random.nextBoolean();
        }
    }

    public Ladder[] makeLadders () {
        Ladder[] ladders = new Ladder[this.maxLadderHeight];
        for (int i = 0; i < this.maxLadderHeight; i++) {
            ladders[i] = new Ladder(this.numOfPeople, this.maxLadderHeight);
        }
        return ladders;
    }
}

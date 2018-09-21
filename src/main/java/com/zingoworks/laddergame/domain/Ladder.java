package com.zingoworks.laddergame.domain;

import java.util.ArrayList;

public class Ladder {
    static final String BLANK = " ";
    static final int NAMELENGTHLIMIT = 6;
    static final int ZERO = 0;

    private int numOfPeople;
    private int maxLadderHeight;
    private String[] nameOfPeople;
    private ArrayList<Line> lines = new ArrayList<>();
    private ArrayList<StringBuilder> names = new ArrayList<>();

    public Ladder (String[] nameOfPeople, int maxLadderHeight) {
        this.nameOfPeople = nameOfPeople;
        this.numOfPeople = nameOfPeople.length;
        this.maxLadderHeight = maxLadderHeight;

        makeLines();
        makeNameMutable();
        setNameLength();
    }

    public int getNumOfPeople () {
        return numOfPeople;
    }

    public int getMaxLadderHeight () {
        return maxLadderHeight;
    }

    public ArrayList<Line> getLines () {
        return lines;
    }

    public ArrayList<StringBuilder> getNames () {
        return names;
    }

    private void makeLines () {
        for (int i = 0; i < maxLadderHeight; i++) {
            lines.add(new Line(numOfPeople));
        }
    }

    private void makeNameMutable () {
        for (int i = 0; i < this.nameOfPeople.length; i++) {
            this.names.add(new StringBuilder(this.nameOfPeople[i]));
        }
    }

    private void setNameLength () {
        for (int i = 0; i < this.names.size(); i++) {
            insertBlank(i);
        }
    }

    private void insertBlank(int i) {
        while (this.names.get(i).length() < NAMELENGTHLIMIT) {
            this.names.get(i).insert(ZERO, BLANK);
        }
    }
}

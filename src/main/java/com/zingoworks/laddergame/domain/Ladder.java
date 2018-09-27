package com.zingoworks.laddergame.domain;

import java.util.ArrayList;

public class Ladder {
    static final String BLANK = " ";
    static final int NAMELENGTHLIMIT = 6;
    static final int ZERO = 0;

    private int numOfPeople;
    private int maxLadderHeight;
    public String[] valueOfLadder;
    private ArrayList<Line> lines = new ArrayList<>();
    private int[] valuesPosition;

    private ArrayList<StringBuilder> names = new ArrayList<>();
    private ArrayList<StringBuilder> values = new ArrayList<>();

    public Ladder (String[] nameOfPeople, int maxLadderHeight, String[] valueOfLadder) {
        this.numOfPeople = nameOfPeople.length;
        this.maxLadderHeight = maxLadderHeight;
        this.valueOfLadder = valueOfLadder;
        makeNameMutable(nameOfPeople);
        makeLines();
        setNameLength();
        makeValueMutable(this.valueOfLadder);
        setValueLength();
        makeValuesPosition();
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

    public ArrayList<StringBuilder> getValues () {
        return values;
    }

    public int[] getValuesPosition () {
        return valuesPosition;
    }

    private void makeLines () {
        for (int i = 0; i < maxLadderHeight; i++) {
            lines.add(new Line(numOfPeople));
        }
    }

    private void makeValuesPosition () {
        this.valuesPosition = new int[numOfPeople];
        for (int i = 0; i < numOfPeople; i++) {
            valuesPosition[i] = i;
        }
        for (int i = 0; i < maxLadderHeight; i++) {
            for (int j = 0; j < numOfPeople; j++) {
                setValuesPosition(lines.get(i), valuesPosition[j], j);
            }
        }
    }

    private void setValuesPosition (Line l, int position, int j) {
        if ((position == 0) && (l.getBooleanInfo(0) == true)) {
            valuesPosition[j] += 1;
            return;
        }

        if ((position == 0) && (l.getBooleanInfo(0) == false)) {
            return;
        }

        if ((position == numOfPeople - 1) && (l.getBooleanInfo(numOfPeople - 2) == true)) {
            valuesPosition[j] -= 1;
            return;
        }

        if ((position == numOfPeople - 1) && (l.getBooleanInfo(numOfPeople - 2) == false)) {
            return;
        }

        if (l.getBooleanInfo(position - 1) == true) {
            valuesPosition[j] -= 1;
            return;
        }

        if (l.getBooleanInfo(position) == true) {
            valuesPosition[j] += 1;
        }
    }

    private void makeNameMutable (String[] nameOfPeople) {
        for (int i = 0; i < nameOfPeople.length; i++) {
            this.names.add(new StringBuilder(nameOfPeople[i]));
        }
    }

    public void setNameLength () {
        for (int i = 0; i < this.names.size(); i++) {
            insertBlankInName(i);
        }
    }

    private void insertBlankInName(int i) {
        while (this.names.get(i).length() < NAMELENGTHLIMIT) {
            this.names.get(i).insert(ZERO, BLANK);
        }
    }

    private void makeValueMutable (String[] valueOfLadder) {
        for (int i = 0; i < valueOfLadder.length; i++) {
            this.values.add(new StringBuilder(valueOfLadder[i]));
        }
    }

    private void setValueLength () {
        for (int i = 0; i < this.values.size(); i++) {
            insertBlankInValue(i);
        }
    }

    private void insertBlankInValue(int i) {
        while (this.values.get(i).length() < NAMELENGTHLIMIT) {
            this.values.get(i).insert(ZERO, BLANK);
        }
    }
}

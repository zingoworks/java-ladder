package com.zingoworks.laddergame.domain;

import java.util.ArrayList;
import java.util.Random;

public class Line {
    public ArrayList<Boolean> points = new ArrayList<>();

    Random random = new Random();

    public Line (int numOfPeople) {
        makeLine(numOfPeople);
        updateLineProper();
    }

    public void makeLine (int numOfPeople) {
        for (int i = 0; i < numOfPeople - 1; i++) {
            points.add(random.nextBoolean());
        }
    }

    private void updateLineProper() {
        for (int i = 0; i < points.size() - 1; i++) {
            updateValueProper(i);
        }
    }

    private void updateValueProper(int i) {
        if (points.get(i) == true && points.get(i + 1) == true) {
            points.set(i + 1, false);
        }
    }

    public Boolean getBooleanInfo (int i) {
        return points.get(i);
    }
}

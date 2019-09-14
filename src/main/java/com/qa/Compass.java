package com.qa;

public class Compass {

    float distanceToTreasure;

    public Compass(){}

    public float getDistanceToTreasure() {
        System.out.println("Current distance to treasure" + distanceToTreasure);
        return distanceToTreasure;
    }

    public void setDistanceToTreasure(Player p, Treasure t) {
        int xDistance;
        int yDistance;
        if (p.getX() > t.getX()) {
            xDistance = p.getX() - t.getX();
        } else {
            xDistance = t.getX() - p.getX();
        }

        if (p.getY() > t.getY()) {
            yDistance = p.getY() - t.getY();
        } else {
            yDistance = t.getY() - p.getY();
        }

        float sum = (float) Math.pow(xDistance, 2) + (float)Math.pow(yDistance, 2);
        this.distanceToTreasure = (int) Math.sqrt(sum);

    }

}

package com.qa;

public class Treasure extends Tile {

    int x;
    int y;

    public Treasure(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    int getX() {
        return this.x;
    }

    @Override
    void setX(int x) {
        this.x = x;
    }

    @Override
    int getY() {
        return this.y;
    }

    @Override
    void setY(int y) {
        this.y = y;
    }
}

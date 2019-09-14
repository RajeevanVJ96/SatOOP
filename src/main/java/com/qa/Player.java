package com.qa;

public class Player extends Tile {


    int x;
    int y;
    String name;
    String availableMovements;

    public Player(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
        this.availableMovements = "You can travel N, S, E, W";
    }

    public String getAvailableMovements() {
        return availableMovements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}

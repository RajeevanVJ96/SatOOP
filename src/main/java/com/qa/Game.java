package com.qa;

import java.util.Scanner;

public class Game {

    boolean running;

    public boolean isRunning() {
        return running;
    }

    public Game(boolean running) {
        this.running = running;
    }

    public void introduction(Player p) {
        System.out.println("Hello" + p.getName());
        System.out.println("You find yourself in a murky swamp");
        System.out.println("You look down to see a compass");
        System.out.println("It correctly points to the treasure");
    }

    public void getDistanceToTreasure(Player p, Treasure t, Compass c ){
            c.getDistanceToTreasure();
            p.getAvailableMovements();
    }

    public void gameLoop(Player p, Treasure t, Compass c){
        Scanner sc = new Scanner(System.in);
        String direction;
        while(this.isRunning()){
            System.out.println("Please enter a direction: " + p.getAvailableMovements());
            direction = sc.next();
            direction.toLowerCase();
            switch (direction){
                case "north":
                    System.out.println("Going North");
                    p.setY(p.getY() + 1);
                    break;
                case "east":
                    System.out.println("Going East");
                    p.setX(p.getX() + 1);
                    break;
                case "west":
                    System.out.println("Going West");
                    p.setX((p.getX() + 1));
                    break;
                case "south":
                    System.out.println("Going South");
                    p.setY(p.getY() - 1);
                    break;
                default:
                    System.out.println("Please try again");
                    p.getAvailableMovements();
            }
            c.setDistanceToTreasure(p,t);
            if(c.getDistanceToTreasure() == 0) {
                System.out.println("Congrats you won");
                this.running = false;
            }else {
                c.getDistanceToTreasure();
            }



        }


    }




    }


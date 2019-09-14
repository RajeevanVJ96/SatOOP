package com.qa;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        Player p1 = new Player(10,10, name);
        Treasure t1 = new Treasure(10, 10);

        Compass c = new Compass();
        c.setDistanceToTreasure(p1, t1);
        System.out.println(c.getDistanceToTreasure());
        Game g = new Game(true);
        g.introduction(p1);
        while(g.isRunning()){
            g.gameLoop(p1, t1, c);
        }

    }
}

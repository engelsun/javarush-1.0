package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Artyom on 10.1.17.
 */
public class Hippodrome {

    private ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();
        game.getHorses().add(new Horse("Ivi", 3, 0));
        game.getHorses().add(new Horse("Speedy", 3, 0));
        game.getHorses().add(new Horse("Patrick", 3, 0));
        game.run();
        game.printWinner();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void move() {
        for (Horse currentHorse :
                horses) {
            currentHorse.move();
        }
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200); // or that:"TimeUnit.MILLISECONDS.sleep(10);"
        }
    }

    public void print(){
        for (Horse currentHorse :
                horses) {
            currentHorse.print();
        }
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse currentHorse :
                horses) {
            if (currentHorse.getDistance() > winner.getDistance()) {
                winner = currentHorse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}

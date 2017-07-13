package com.javarush.test.level21.lesson16.big01;

/**
 * Created by Artyom on 10.1.17.
 */
public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void move() {
        //speed *= Math.random(); - WHY this not work?
        //distance += speed;
        distance += speed * Math.random();
    }

    public void print() {
        for (int i = 0; i < Math.round(distance); i++) {
            System.out.print(".");
        }
        System.out.print(name);
        System.out.println();
    }
}

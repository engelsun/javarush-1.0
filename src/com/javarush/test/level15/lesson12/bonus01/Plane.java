package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Артём on 10.10.2016.
 */
public class Plane implements Flyable
{
    @Override
    public void fly()
    {

    }

    int passages;

    public Plane (int passages){this.passages = passages;}
}

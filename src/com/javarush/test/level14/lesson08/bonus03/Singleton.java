package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Артём on 04.10.2016.
 */
public class Singleton
{
    private final static Singleton value = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){return value;}
}

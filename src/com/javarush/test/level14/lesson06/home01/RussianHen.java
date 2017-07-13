package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Артём on 30.09.2016.
 */
public class RussianHen extends Hen implements Country
{

    int getCountOfEggsPerMonth()
    {
        return 150;
    }
    public  String getDescription()
    {
        String hen = super.getDescription();
        return  hen + " Моя страна - " + RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

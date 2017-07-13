package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Артём on 30.09.2016.
 */
public class BelarusianHen extends Hen implements Country
{
    int getCountOfEggsPerMonth()
    {
        return 160;
    }

    public  String getDescription()
    {
        String hen = super.getDescription();
        return  hen + " Моя страна - " + BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

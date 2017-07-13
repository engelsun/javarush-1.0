package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Артём on 30.09.2016.
 */
public class UkrainianHen extends Hen implements Country
{
    int getCountOfEggsPerMonth()
    {
        return 170;
    }

    public  String getDescription()
    {
        String hen = super.getDescription();
        return  hen + " Моя страна - " + UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

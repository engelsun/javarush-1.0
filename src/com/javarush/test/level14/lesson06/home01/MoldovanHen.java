package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Артём on 30.09.2016.
 */
public class MoldovanHen extends Hen implements Country
{
    int getCountOfEggsPerMonth()
    {
        return 145;
    }

    public  String getDescription()
    {
        String hen = super.getDescription();
        return  hen + " Моя страна - " + MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

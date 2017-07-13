package com.javarush.test.level08.lesson06.task03;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getTimeMsOfInsert(new ArrayList()));//25
        System.out.println(getTimeMsOfInsert(new LinkedList()));//11 win
    }

    public static long  getTimeMsOfInsert(List list)
    {
        Date start = new Date();
        //напишите тут ваш код

        insert10000(list);

        Date end = new Date();
        int time = (int) (end.getTime() - start.getTime());
        return time;
        //напишите тут ваш код
    }

    public static void insert10000(List list)
    {
        for (int i=0;i<10000;i++)
        {
            list.add(0, new Object());
        }
    }
}

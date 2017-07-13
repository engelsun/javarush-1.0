package com.javarush.test.level04.lesson04.task06;

/**
 * Created by Артём on 01.07.2016.
 */

import java.io.*;

public class task6_v2
{public static void main(String[] args) throws Exception
{
    BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
    String a1 = reader.readLine();
    int b = Integer.parseInt(a1);
    if (b<=7&&b>0&&b!=0){
        if(b==1)
            System.out.println("понедельник");
        else if(b==2)
            System.out.println("вторник");
        else if(b==3)
            System.out.println("среда");
        else if(b==4)
            System.out.println("четверг");
        else if(b==5)
            System.out.println("пятница");
        else if(b==6)
            System.out.println("суббота");
        else if(b==7)
            System.out.println("воскресенье");
    }
    else {
        System.out.println("такого дня недели не существует");
    }

}
}

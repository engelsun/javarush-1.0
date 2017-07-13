package com.javarush.test.level04.lesson04.task04;

/**
 * Created by Артём on 01.07.2016.
 */
public class task4_v2
{ public static void main(String[] args) {
    checkSeason(12);
    checkSeason(4);
    checkSeason(7);
    checkSeason(10);
}

    public static void checkSeason(int mount){
        if (mount>=1&&mount<=2||mount==12)
            System.out.println("зима");
        if (mount>=3&&mount<=5)
            System.out.println("весна");
        if (mount>=6&&mount<=8)
            System.out.println("лето");
        if (mount>=9&&mount<=11)
            System.out.println("осень");//::CODE:// почему не проходит проверку этот вариант не понятно, т.к. компилируется и выведенное совпадает с требуемым ответом в задании.
    }
}

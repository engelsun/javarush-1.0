package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper
{
    public static String multiply(String s)
    {
        String result = "";
        for(int a=0;a<5;a++)
            result += s;
        return result;//напишите тут ваш код
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        for(;0<count;count--)
            result += s;
        return result;//напишите тут ваш код
    }
}

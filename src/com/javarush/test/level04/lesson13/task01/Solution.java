package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a;
        for(a=1;a<=100; a++)
        {
            if(a%2==0)
                System.out.println(a);


        }
            //напишите тут ваш код

    }
}

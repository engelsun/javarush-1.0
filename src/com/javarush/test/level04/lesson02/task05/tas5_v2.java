package com.javarush.test.level04.lesson02.task05;

/**
 * Created by Артём on 01.07.2016.
 */
public class tas5_v2
{public static void main(String[] args)
{
    Cat cat1 = new Cat();
    Cat.count++;//напишите тут ваш код
    Cat cat2 = new Cat();
    Cat.count++;//напишите тут ваш код

    System.out.println("Cats count is " + Cat.count);
}
    public static class Cat
    {
        public static int count = 0;

    }
}

package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String Name;
        int Weight;
        int Age;
        String sex;
        int Power;
        int Brain;

        public Human(String name, int weight, int age, int power, int brain)
        {
            Name = name;
            Weight = weight;
            Age = age;
            Power = power;
            Brain = brain;
        }

        public Human(String name, int power, String sex)
        {
            Name = name;
            Power = power;
            this.sex = sex;
        }

        public Human(String name, int weight, int age, String sex, int power, int brain)
        {
            Name = name;
            Weight = weight;
            Age = age;
            this.sex = sex;
            Power = power;
            Brain = brain;
        }

        public Human(int weight, String name, int power)
        {
            Weight = weight;
            Name = name;
            Power = power;
        }

        public Human(String name, int brain, int power, String sex)
        {
            Name = name;
            Brain = brain;
            Power = power;
            this.sex = sex;
        }

        public Human(String sex, int age)
        {
            this.sex = sex;
            Age = age;
        }

        public Human(int weight, int power, int brain)
        {
            Weight = weight;
            Power = power;
            Brain = brain;
        }

        public Human(String name)
        {
            Name = name;
        }

        public Human(String name, int weight, int age)
        {
            Name = name;
            Weight = weight;
            Age = age;
        }

        public Human(int power, int brain)
        {
            Power = power;
            Brain = brain;
        }

        public Human(int age, String sex)
        {
            Age = age;
            this.sex = sex;
        }



        //напишите тут ваши переменные и конструкторы
    }
}

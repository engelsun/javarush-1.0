package com.javarush.test.level04.lesson01.task01;

/* Shadowing variables
Подумайте, что делает программа.
Исправьте ошибку в программе чтобы переменная age объекта person изменила свое значение.
Подсказка: тщательно просмотрите метод adjustAge
*/
//цель задания показать очерёдность выполнения строк в методе main и какие значения будут выполнятся, тоесть
//если ничего не изменять, то в метод adjustAge будет заносится значение объекта Person, тоесть 20, а не результат сложения в теле метода, как можно подумать
//результат сложения будет заносится в строку 21(System.out.println("Adjusted Age is: " + person.age);)
//а нам необходимо, чтобы результат сложения вывелся в строке 20 (person.adjustAge(person.age);)
//для этого нужно персонализировать age в методе adjustAge добавив "this." перед age
// то будет значит, что в данном методе аргументом будет не значение объекта Person, а результ сложения: значение объекта Person + 20
public class Solution
{
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
    }

    public static class Person
    {
        public int age = 20;

        public void adjustAge(int age)
        {
            this.age = age + 20;
            System.out.println("The Age in adjustAge() is " + age);
        }
    }
}

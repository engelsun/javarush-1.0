package com.javarush.test.level04.lesson01.task02;

/* Реализовать метод addPrice
Реализовать метод addPrice(int applesPrice), чтобы при его вызове суммарная стоимость яблок увеличивалось на переданное значение.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.
*/
public class Solution
{
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple.addPrice(50);// 50 выступает аргументом метода addPrice
        Apple apple2 = new Apple();
        Apple.addPrice(100);// 100 выступает аргументом метода addPrice
        System.out.println("Apples price is " + Apple.applesPrice);
    }

    public static class Apple{
        public static int applesPrice = 0;//здесь после создания строки 11 хранится уже не 0, а 50, т.к. сразу после создания выполняется метод addPrice, где Apple.applesPrice - равно 0, а applesPrice - равно 50

        public static void addPrice(int applesPrice)// сюда после создания строки 13  вместо 50 заносится 100 и сразу после испонения этого метода строка 18 меняет значение с 50 на 150
        {
            Apple.applesPrice = Apple.applesPrice + applesPrice;
        }
    }
}

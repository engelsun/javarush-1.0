package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Возвращаем все как было
        System.setOut(consoleStream);

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        String[] arrayOfChar = result.split(" ");
        String operator = arrayOfChar[1];
        int firstValue = Integer.parseInt(arrayOfChar[0]);
        int secondValue = Integer.parseInt(arrayOfChar[2]);
        int arithmeticResult = 0;
        if (operator.equals("+"))
        {
            arithmeticResult = firstValue + secondValue;
        } else if (operator.equals("-"))
        {
            arithmeticResult = firstValue - secondValue;
        } else if (operator.equals("*"))
        {
            arithmeticResult = firstValue * secondValue;
        }
        String resultFinal = String.format("%d %s %d = %d",firstValue,operator,secondValue,arithmeticResult);

        System.out.printf(resultFinal);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


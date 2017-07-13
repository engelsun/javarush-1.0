package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {

    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {
        threads.add(new OneThread());
        threads.add(new TwoThread());
        threads.add(new ThreeThread());
        threads.add(new FourThread());
        threads.add(new FiveThread());
    }

    public static class OneThread extends Thread {
        public void run(){
            while (!isInterrupted()) {}
        }
    }
    public static class TwoThread extends Thread{
        public void run(){
            try
            {
                throw new InterruptedIOException();
            }
            catch (InterruptedIOException e)
            {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class ThreeThread extends Thread{
        public void run(){
            try
            {
                while (!isInterrupted()){
                    Thread.sleep(500);
                    System.out.println("Ура");}
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public static class FourThread extends Thread implements Message{

        public void run(){
            while (!isInterrupted()){}
        }
        @Override
        public void showWarning()
        {
            try {
                this.interrupt();
                this.join();
            }
            catch (InterruptedException e)
            {
            }
        }
    }

    public static class FiveThread extends Thread{
        int n;
        public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try
            {
                String sum = reader.readLine();
                while (true)
                {
                    n += Integer.parseInt(sum);
                    sum = reader.readLine();
                    if(sum.equals("N")) break;

                }
                System.out.println(n);

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}



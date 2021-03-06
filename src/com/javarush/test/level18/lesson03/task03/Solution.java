package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int currentByte;

        while(fileInputStream.available() > 0)
        {
            currentByte = fileInputStream.read();
            if (!map.containsKey(currentByte)) map.put(currentByte,1);
            else map.put(currentByte,map.get(currentByte)+1);
        }
        fileInputStream.close();
        reader.close();

        int maxValue = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>maxValue) {
                maxValue=entry.getValue();
            }
        }

        for(Map.Entry<Integer, Integer> l:map.entrySet()){
            if(l.getValue()==maxValue)
                System.out.print(l.getKey()+" ");
        }

    }
}

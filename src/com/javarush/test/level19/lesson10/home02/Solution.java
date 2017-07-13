package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<String, Double>();
        Double value;

        while (in.ready()){
            String[] line = in.readLine().split(" ");
            value = Double.parseDouble(line[1]);

            if (map.containsKey(line[0]))
            {
                value = value + map.get(line[0]);
                map.put(line[0], value);
            } else
            {
                map.put(line[0], value);
            }
        }
        in.close();

        double max = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            if (entry.getValue() > max)
            {
                max = entry.getValue();
            }
        }

        ArrayList<String> theRichest = new ArrayList<>();
        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            if (entry.getValue() == max)
            {
                theRichest.add(entry.getKey());
            }
        }

        for (String s :
                theRichest)
        {
            System.out.print(s + " ");
        }
    }
}

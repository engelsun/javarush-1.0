package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        /*              ANOTHER VARIANT
        String fileName = args[0];
        BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName));
        String lineOfFile;
        List<String> listOfLines = new ArrayList<>();
        while ((lineOfFile = bufferedFileReader.readLine()) != null)
        {
            listOfLines.add(lineOfFile);
        }
        bufferedFileReader.close();

        List<String> namesList = new ArrayList<>();
        List<Double> valuesList = new ArrayList<>();
        for (String line :
                listOfLines)
        {
            String[] arrayOfLines = line.split(" ");//else put out of loop "String[] arrayOfLines;", why this work correct?
            namesList.add(arrayOfLines[0]);
            valuesList.add(Double.valueOf(arrayOfLines[1]));
        }


        Map<String, Double> map = new TreeMap<>();
        for (int i = 0; i < namesList.size(); i++)
        {
            if(map.containsKey(namesList.get(i)))
            {
                for (Map.Entry<String, Double> set :
                        map.entrySet())
                {
                    if (set.getKey().equals(namesList.get(i)))
                    {
                        double value = set.getValue() + valuesList.get(i);
                        map.put(namesList.get(i), value);
                    }
                }
            }else
            {
                map.put(namesList.get(i), valuesList.get(i));
            }
        }

        for (Map.Entry<String, Double> mapPrint:
                map.entrySet())
        {
            System.out.println(mapPrint.getKey() + " " + mapPrint.getValue());
        }*/

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


        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

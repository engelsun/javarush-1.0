package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        String id = null;
        if (args[0].equals("-c"))
        {
            id = String.valueOf(setMaxId(fileName));
            id = setFormatPositionOfValueName(id, 8);
        }
        String productName = setFormatPositionOfValueName(args[1], 30);
        String price = setFormatPositionOfValueName(args[2], 8);
        String quantity = setFormatPositionOfValueName(args[3], 4);

        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
        printWriter.println(id + productName + price + quantity);
        printWriter.close();
    }


    public static int setMaxId (String fileName) throws IOException
    {
        ArrayList<Integer> allIds = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        int currentId;
        while ((line = bufferedReader.readLine()) != null)
        {
            line = line.substring(0, 8).replaceAll("\\s", "");
            currentId = Integer.parseInt(line);
            allIds.add(currentId);
        }
        bufferedReader.close();
        int MaxId = Collections.max(allIds);
        MaxId++;
        return MaxId;
    }

    public static String setFormatPositionOfValueName (String valueName, int countMaxChar)
    {
        String formattedValueName;
        if (valueName.length() > countMaxChar)
        {
            formattedValueName = valueName.substring(0, countMaxChar);
        }
        else
        {
            String s = "";
            for (int i = 0; i < (countMaxChar - valueName.length()); i++)
            {
                s += " ";
            }
            formattedValueName = valueName + s;
        }
        return formattedValueName;
    }
}

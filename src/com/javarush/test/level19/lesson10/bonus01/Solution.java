package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
               строка0            ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
               строка5            ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        List<String> file1 = new ArrayList<>();
        List<String> file2 = new ArrayList<>();

        BufferedReader readFile1 = new BufferedReader(new FileReader(fileName1));
        while(readFile1.ready())
            file1.add(readFile1.readLine());
        readFile1.close();

        BufferedReader readFile2 = new BufferedReader(new FileReader(fileName2));
        while(readFile2.ready())
            file2.add(readFile2.readLine());
        readFile2.close();
//        WITH THIS VARIABLES DO NOT WORK, WHY?
//        boolean equal = !file1.get(0).equals(file2.get(0));
//        boolean oneEqualSecondZero = !file1.get(1).equals(file2.get(0));
//        boolean zeroEqualSecondOne = !file1.get(0).equals(file2.get(1));

        //if "&" - very faster, if "&&" - very long
        while(file1.size() > 0 & file2.size() > 0) {

            if(file1.get(0).equals(file2.get(0))) {
                lines.add(new LineItem(Type.SAME, file1.get(0)));
                file1.remove(0);
                file2.remove(0);
            } else if (!file1.get(0).equals(file2.get(0)) && file1.size() != 0 && file1.get(1).equals(file2.get(0)) && !file1.get(0).equals(file2.get(1)))
            {
                lines.add(new LineItem(Type.REMOVED, file1.get(0)));
                file1.remove(0);
            } else if (!file1.get(0).equals(file2.get(0)) && file2.size() != 0 && file1.get(0).equals(file2.get(1)))
            {
                lines.add(new LineItem(Type.ADDED, file2.get(0)));
                file2.remove(0);
            }

            if(file1.size() == 0 && file2.size() > 0)    {
                lines.add(new LineItem(Type.ADDED, file2.get(0)));
            }else if(file2.size() == 0 && file1.size() > 0){
                lines.add(new LineItem(Type.REMOVED, file1.get(0)));
            }
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        @Override
        public String toString()
        {
            return type +
                    " " + line;
        }

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

    }
}

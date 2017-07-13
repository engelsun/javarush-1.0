package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Backham", new Date("JULY 1 1983"));
        map.put("Wade", new Date("DECEMBER 1 1980"));
        map.put("Worm", new Date("OCTOBER 1 1981"));
        map.put("Integer", new Date("MAY 1 1987"));
        map.put("William", new Date("JUNE 1 1985"));
        map.put("Bryant", new Date("APRIL 1 1979"));
        map.put("Garnett", new Date("JUNE 1 1980"));
        map.put("Chak", new Date("JUNE 1 1980"));
        map.put("Phil", new Date("AUGUST 1 1980"));


        return map;///напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            int month = value.getMonth();
            if (month >= 5 && month <= 7)
            {
                iterator.remove();
            }
        }//напишите тут ваш код
    }
}

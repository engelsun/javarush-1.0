package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("A", "Oleg");
        map.put("B", "Sasha");
        map.put("C", "Andrey");
        map.put("D", "Kolya");
        map.put("E", "Vasya");
        map.put("F", "Petya");
        map.put("G", "Andrey");
        map.put("H", "Oleg");
        map.put("I", "Sasha");
        map.put("J", "Andrey");
        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> list = new ArrayList<String>(map.values());
        ArrayList<String> list1 = new ArrayList<String>();

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> temp = iterator.next();
            //проверка на количество совпадений
            int j=0;
            for (int i = 0; i <list.size() ; i++)
            {
                if (temp.getValue().equals(list.get(i))) j++;
            }
            if (j>1&& !(list1.contains(temp.getValue()))) list1.add(temp.getValue());
        }
        for (String s:list1){
            removeItemFromMapByValue(map,s);
        }
        //напишите тут ваш код
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}

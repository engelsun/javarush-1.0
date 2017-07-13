package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> s = new ArrayList<String>();
        Collections.addAll(s,"мама","именно","мыла","именно","раму","именно");

        for (String p : s)
            System.out.println(p);
        //напишите тут ваш код

    }
}

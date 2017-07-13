package com.javarush.test.level22.lesson13.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {

    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        List<String> arrayList = new ArrayList<>();

        while (stringTokenizer.hasMoreTokens()) {
           arrayList.add(stringTokenizer.nextToken());
        }

        String[] tokenArray = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            tokenArray[i] = arrayList.get(i);
        }
        return tokenArray;
    }
    /*
    * //ANOTHER VARIANT//
    * StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
    * String tokenArray = new String[stringTokenizer.countTokens()];
    * int index = 0;
    * while (stringTokenizer.hasMoreTokens()) {
    *   tokenArray[i] = stringTokenizer.nextToken());
    *   i++;
    * }
    * return tokenArray;
    * */
}

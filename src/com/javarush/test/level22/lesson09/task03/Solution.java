package com.javarush.test.level22.lesson09.task03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Составить цепочку слов
В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //...
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = nameReader.readLine();
        nameReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        List<String> wordsList = new ArrayList<>();
        while (fileReader.ready()) {
            wordsList.addAll(Arrays.asList(fileReader.readLine().split(" ")));
        }
        fileReader.close();
        String[] wordArray = wordsList.toArray(new String[wordsList.size()]);

        StringBuilder result = getLine(wordArray);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0) return new StringBuilder();
        if (words.length == 1 || words[0].equals("")) return new StringBuilder(words[0]);

        StringBuilder result = new StringBuilder();
        List<String> wordListFromArray = new ArrayList<>();

        wordListFromArray.addAll(Arrays.asList(words));
        while (wordListFromArray.remove("")) {
            wordListFromArray.remove("");
        }

        while (isYes(wordListFromArray)) {
            Collections.shuffle(wordListFromArray);
        }

        for (String word :
                wordListFromArray) {
            result.append(word + " ");
        }
        result.deleteCharAt(result.length() - 1);
        return result;
    }

    public static boolean isYes(List<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get((i) + 1).toLowerCase();

            if(firstWord.charAt(firstWord.length()-1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
}

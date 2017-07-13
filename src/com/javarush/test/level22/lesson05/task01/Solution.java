package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        String s = "JavaRush - лучший сервис обучения Java.";
        String s2 = "JavaRush - лучший сервис ";
        String s3 = "JavaRush - лучший ";
        String s4 = "";
        String s5 = " ";
        System.out.println(getPartOfString(s4));
        System.out.println(getPartOfString(s));
        System.out.println(getPartOfString(s2));
        System.out.println(getPartOfString(s3));

        System.out.println(getPartOfString(s5));

    }

    public static String getPartOfString(String string) throws TooShortStringException{
        String result = null;
        if(string == null || string.isEmpty()){
            throw new TooShortStringException();
        }

        int indexBegin = string.indexOf(" ") + 1;
        int lastIndex = 0;
        int countOfSpaces = 0;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (charArray[i] == ' ') {
                countOfSpaces++;
                if (countOfSpaces == 4) {
                    lastIndex = string.length();
                } else if (countOfSpaces == 5) {
                    lastIndex = i;
                    break;
                }
            }
        }

//        if (countOfSpaces >= 1 && countOfSpaces < 4) {
//            try {
//                throw new TooShortStringException();
//            } catch (TooShortStringException e) {
//                result = "String is short, string must have 4 and more spaces!";
//            }
//        } else if (indexBegin == (-1)) {
//            try {
//                throw new TooShortStringException();
//            } catch (TooShortStringException e) {
//                result = "String is empty!";
//            }

            try {
                result = string.substring(indexBegin, lastIndex);
            } catch (Exception e) {
                throw new TooShortStringException();
            }

        return result;
    }

    public static class TooShortStringException extends Exception{
    }
}

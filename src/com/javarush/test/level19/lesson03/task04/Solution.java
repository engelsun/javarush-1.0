package com.javarush.test.level19.lesson03.task04;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner scanner;

        PersonScannerAdapter(Scanner scanner)
        {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {
            Person person = new Person(null, null, null, null);
            if (scanner.hasNext())
            {
                String[] inputStrings = scanner.nextLine().split(" ");

                int birthYear = Integer.parseInt(inputStrings[5]);
                int birthMonth = Integer.parseInt(inputStrings[4]) - 1;
                int birthDay = Integer.parseInt(inputStrings[3]);
                Date birthDate = (new GregorianCalendar(birthYear, birthMonth, birthDay).getTime());

                String firstName = inputStrings[1];
                String middleName = inputStrings[2];
                String lastName = inputStrings[0];

                person = new Person(firstName, middleName, lastName, birthDate);
            }
            return person;
        }

        @Override
        public void close() throws IOException
        {
            scanner.close();
        }
    }
}

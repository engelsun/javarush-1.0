package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("writerReaderObject", ".txt", new File("D:\\"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);
            DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

            User user1 = new User();
            user1.setFirstName("Artem");
            user1.setLastName("Romenskiy");
            user1.setBirthDate(dateFormat.parse("1993.12.16."));
            user1.setMale(true);
            user1.setCountry(User.Country.UKRAINE);

            User user2 = new User();
            user2.setFirstName("Ivan");
            user1.setLastName("Romenskiy");
            user2.setBirthDate(dateFormat.parse("1982.1.14."));
            //user2.setCountry(User.Country.RUSSIA);
            user2.setMale(false);


            javaRush.users.add(user1);
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.");

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);

            if (this.users.size() > 0)
            {
                for (User user :
                        users)
                {
                    printWriter.println("@");

                    String firstName = user.getFirstName();
                    printWriter.println(firstName);

                    String lastName = user.getLastName();
                    printWriter.println(lastName);

                    printWriter.println(dateFormat.format(user.getBirthDate()));

                    printWriter.println(String.valueOf(user.isMale()));

                    if (user.getCountry() == null)
                    {
                        User.Country country = User.Country.OTHER;
                        printWriter.println(country);
                    }else
                    {
                        printWriter.println(user.getCountry());
                    }
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready())
            {
                String newUser = reader.readLine();

                if (newUser.equals("@"))
                {
                    User user = new User();
                    String firstName = reader.readLine();
                    user.setFirstName(firstName);

                    String lastName = reader.readLine();
                    user.setLastName(lastName);

                    user.setBirthDate(dateFormat.parse(reader.readLine()));

                    if (reader.readLine().equals("true"))
                    {
                        user.setMale(true);
                    }else
                    {
                        user.setMale(false);
                    }

                    user.setCountry(User.Country.valueOf(reader.readLine()));
                    users.add(user);
                }
            }
            reader.close();
        }
    }
}

package com.javarush.test.level19.lesson03.task05;

import java.util.HashMap;
import java.util.Map;

/* Закрепляем адаптер
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {
    private static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");
    }
    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact)
        {
            this.customer = customer;
            this.contact = contact;
        }
        @Override
        public String getCountryCode()
        {
            String countryCode = "";
            String countryName = customer.getCountryName();
            for (Map.Entry<String, String> map :
                    countries.entrySet())
            {
                if (map.getValue().equals(countryName))
                {
                    countryCode = map.getKey();
                }
            }
            return countryCode;
        }

        @Override
        public String getCompany()
        {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName()
        {
            int indexOfSubstring = this.contact.getName().indexOf(' ');
            String firstName = this.contact.getName().substring(indexOfSubstring+1);
//             ANOTHER VARIANT
//            return contact.getName().split(", ")[1];
//                OR
//            return this.contact.getName().substring(this.contact.getName().indexOf(' ')+1);
            return this.contact.getName().substring(this.contact.getName().indexOf(' ')+1);
        }

        @Override
        public String getContactLastName()
        {
            int indexOfSubstring = this.contact.getName().indexOf(',');
            String lastName = this.contact.getName().substring(0,indexOfSubstring);
            // ANOTHER VARIANT
            // return contact.getName().split(", ")[0];
//              OR
//            return this.contact.getName().substring(0,this.contact.getName().indexOf(','));
            return lastName;
        }

        @Override
        public String getDialString()
        {
            String phoneNumberChange = "callto://" + contact.getPhoneNumber().replaceAll("[()-]","");
//            OR
//          return "callto://" + contact.getPhoneNumber().replace("(", "").replace(")", "").replace("-", "");
            return phoneNumberChange;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}
package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String[] a = new String[3];
        a[0] = "Мама";
        a[1] = "Мыла";
        a[2] = "Раму";
        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<=2;j++)
            {
                for (int k=0;k<=2;k++)
                {
                    if ( (i!=j)&&(i!=k)&&(j!=k))
                    {
                        System.out.println(a[i]+a[j]+a[k]);
                    }
                }
            }
        }
    }
}
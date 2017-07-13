package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    private Solution(Double a){}
    private Solution(Double a, int b){}
    private Solution(int a, Double b){}

    public Solution(String s){}
    public Solution(int a){}
    public Solution(double a){}

    Solution(String s, int a){}
    Solution(int a, Solution s){}
    Solution(int a, double b){}

    protected Solution(Integer a){}
    protected Solution(Integer a, double b){}
    protected Solution(Integer a, boolean c){}
}


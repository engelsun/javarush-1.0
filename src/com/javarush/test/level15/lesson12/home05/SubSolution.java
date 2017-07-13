package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Артём on 06.10.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution(String s)
    {
        super(s);
    }

    protected SubSolution(Integer a, boolean c)
    {
        super(a, c);
    }

    protected SubSolution(Integer a, double b)
    {
        super(a, b);
    }

    protected SubSolution(Integer a)
    {
        super(a);
    }

    public SubSolution(int a)
    {
        super(a);
    }

    public SubSolution(double a)
    {
        super(a);
    }

    SubSolution(String s, int a)
    {
        super(s, a);
    }

    SubSolution(int a, Solution s)
    {
        super(a, s);
    }

    SubSolution(int a, double b)
    {
        super(a, b);
    }

    private SubSolution(Double a){super(a);}
    private SubSolution(Double a, int b){super(a);}
    private SubSolution(int a, Double b){super(a);}
}

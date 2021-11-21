package com.demo.test;

public class CalculateSquareImpl {
    public static void main(String[] a)
    {
        int y=10;
        CalculateSquare calculateSquare = x-> x*x;
        System.out.println(calculateSquare.calculate(y));
    }
}

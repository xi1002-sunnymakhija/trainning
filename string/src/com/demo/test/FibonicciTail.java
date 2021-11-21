package com.demo.test;

public class FibonicciTail {
    public static void main(String[] a)
    {
       System.out.println(fib(5, 0, 1));
    }

    static int fib(int n, int a, int b)
    {
        if(n==0) return a;
        if (n==1) return b;
        return fib(n-1, b, a+b);
    }
}




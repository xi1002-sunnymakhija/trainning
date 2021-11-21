package com.demo.test;

public class ToggleWord {

    public static void main(String[] a)
    {
        String str = "my name is khan";
        String[] strArray= str.split(" ");
        String toggel="";
        for(String word: strArray)
        {
           String first= word.substring(0,1);
           String afterFirst =word.substring(1);
           toggel+=first.toLowerCase() + afterFirst.toUpperCase()+ " ";
        }

        System.out.println(toggel);
    }
}

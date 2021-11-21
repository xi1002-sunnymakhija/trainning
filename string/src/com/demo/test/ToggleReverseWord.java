package com.demo.test;

public class ToggleReverseWord {
    public static void main(String[] a)
    {
        String str = "my name is khan";
        String[] strArray= str.split(" ");
        String toggel="";
        for(String word: strArray)
        {
            StringBuilder stringBuilder= new StringBuilder(word);
            stringBuilder.reverse();
            String first= stringBuilder.substring(0,1);
            String afterFirst =stringBuilder.substring(1);
            toggel+=first.toLowerCase() + afterFirst.toUpperCase()+ " ";
        }

        System.out.println(toggel);
    }
}

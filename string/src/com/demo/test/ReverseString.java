package com.demo.test;

public class ReverseString {

    public static void main(String[] a)
    {
        String str = "malayalam";
        System.out.println(reverseStrig(str));
    }

    private static boolean reverseStrig(String str)
    {
        int i=0;
        int last= str.length() -1;
        while(i<str.length()/2)
        {
            if(str.charAt(i++) != str.charAt(last--))
            {
                return false;
            }

        }
        return true;
    }
}

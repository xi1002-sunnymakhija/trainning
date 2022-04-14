package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class AllPalindromeString {

    public static void main(String[] a)
    {
        String s = "HAH comes to PAPA PAP";
        findPalindrome(s);
    }

    private static void findPalindrome(String s) {
        String[] s1 = s.split(" ");
        List<String> palindroneStrins= new ArrayList<>();
        for(String ss: s1)
        {
            if(checkPalindrone(ss))
            {
                System.out.println("string palindrome: "+ss);
            }
            else
            {
                System.out.println("string not palindrome: "+ss);

            }
        }
    }

    private static boolean checkPalindrone(String ss) {
        int start=0;
        int le1= ss.length()-1;
        int len= ss.length()-1;
        while(start<=le1/2)
        {
            if(!String.valueOf(ss.charAt(start)).equalsIgnoreCase(String.valueOf(ss.charAt(len))))
            {
                return false;
            }
            start++;
            len--;

        }
        return true;
    }
}

package com.demo.test;

public class DuplicateChar {
    public static void main(String[] a)
    {
        String s= "sunny makhijas";
        findDuplicate(s);
    }

    private static void findDuplicate(String s) {
        int[] a= new int[122];
        char[] arr= s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]++;
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i] > 1)
           System.out.println("i: "+i+":  "+a[i] +  ((char) i));

        }
        String s1 = arr.toString();
        System.out.println(String.valueOf(arr));

    }
}

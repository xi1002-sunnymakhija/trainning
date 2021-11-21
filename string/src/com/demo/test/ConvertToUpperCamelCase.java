package com.demo.test;

import java.util.Arrays;

public class ConvertToUpperCamelCase {

    public static void main(String[] args) {
        String str = "this is hell";
        System.out.println(convertToUpperCase(str));
        str = str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
        //str.replace(" ", "");
        char[] charArray = str.toCharArray();
        int cnt = 0;
        int resdue = 0;
        int n = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == ' ') {
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
                cnt++;
                continue;
            } else {
                charArray[resdue++] = charArray[i];
            }
        }
        System.out.println(Double.parseDouble("-261423.88"));
        System.out.println("char array " + String.valueOf(charArray, 0, n - cnt));

    }

    private static String convertToUpperCase(String str) {
        String[] words = str.split(" ");
        String toggel = "";
        for (String word : words) {
            String first = word.substring(0, 1);
            String second = word.substring(1);
            toggel += first.toUpperCase() + second + " ";
        }
        return toggel;
    }
}

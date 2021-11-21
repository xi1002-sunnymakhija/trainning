package com.demo.test;

public class UnderScoreCamelCase {

    public static void main(String[] a) {

        String str = "this_is_hell_tom";
        str = str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '_') {
                //stringBuilder.deleteCharAt(i);
                stringBuilder.replace(i+1 , i +2, (String.valueOf(Character.toUpperCase(stringBuilder.charAt(i+1)))));
            }
        }

        System.out.println("char array " + stringBuilder.toString());
    }
}

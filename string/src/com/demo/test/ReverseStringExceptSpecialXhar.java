package com.demo.test;

public class ReverseStringExceptSpecialXhar {

    public static void main(String[] a) {

        String str = "Ra_n_dom";
        Character[] ch = new Character[]{'_', '%', '$'};
        char[] strAr = str.toCharArray();
        int startIndex = 0;

        for (int i = strAr.length - 1; i >= 0; ) {
            if (i <= startIndex) {
                break;
            }

            if (strAr[startIndex] == '_') {
                startIndex++;
            }
            if (strAr[i] == '_') {
                i--;
            }

            Character c = strAr[startIndex];
            strAr[startIndex] = strAr[i];
            strAr[i] = c;
            startIndex++;
            i--;
        }
        System.out.println(strAr);
    }
}

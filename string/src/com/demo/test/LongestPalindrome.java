package com.demo.test;

public class LongestPalindrome {
    public static void main(String[] a) {
        String s = "aaaabbaa";
        //System.out.println(longestPalindrome(s, 0, s.length()));
       // longestPalSubstr(s);
        longestPaleSubstr(s);
    }

    private static String longestPalindrome(String s, int i, int i1) {
        int max = 0;
        String maxStr="";
        for (int k = 0; k <= i1; k++) {
            for (int m = k; m <= i1; m++) {
                String str = s.substring(k, m);
                System.out.println("substring is :"+ str);
                    if (str.length() > 1 && checkPalindrome(str)) {
                        String maxString = str;
                        if (str.length() > max) {
                            max = str.length();
                            maxStr = str;
                        }
                    }

                }
            }

        return maxStr;
    }


    private static boolean checkPalindrome(String ss) {
        int start = 0;
        int le1 = ss.length() - 1;
        int len = ss.length() - 1;
        while (start <= le1 / 2) {
            if (!String.valueOf(ss.charAt(start)).equalsIgnoreCase(String.valueOf(ss.charAt(len)))) {
                return false;
            }
            start++;
            len--;

        }
        return true;
    }

    static int longestPalSubstr(String str)
    {
        // get length of input string
        int n = str.length();

        // table[i][j] will be false if
        // substring str[i..j] is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];

        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        // check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for lengths greater than 2.
        // k is length of substring
        for (int k = 3; k <= n; ++k) {

            // Fix the starting index
            for (int i = 0; i < n - k + 1; ++i) {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;

                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1]
                        && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is; ");
        printSubStr(str, start,
                start + maxLength - 1);

        // return length of LPS
        return maxLength;
    }




    static void printSubStr(
            String str, int low, int high)
    {
        System.out.println(
                str.substring(
                        low, high + 1));
    }


    static int longestPaleSubstr(String str)
    {
        int n = str.length(); // calculcharAting size of string
        if (n < 2)
            return n; // if string is empty then size will be 0.
        // if n==1 then, answer will be 1(single
        // character will always palindrome)

        int maxLength = 1,start=0;
        int low, high;
        for (int i = 0; i < n; i++) {
            low = i - 1;
            high = i + 1;
            while ( high < n && str.charAt(high) == str.charAt(i)) //increment 'high'
                high++;

            while ( low >= 0 && str.charAt(low) == str.charAt(i)) // decrement 'low'
                low--;

            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high) ){
                low--;
                high++;
            }

            int length = high - low - 1;
            if (maxLength < length){
                maxLength = length;
                start=low+1;
            }
        }
        System.out.print("Longest palindrome substring is: ");
        System.out.println(str.substring(start, start + maxLength ));
        return maxLength;

    }
}


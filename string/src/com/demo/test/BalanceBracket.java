package com.demo.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceBracket {

    public static void main(String[] a){
        String s= "{([])}";
        if(checkBalanceBrac(s))
        {
            System.out.println("BALANCED");
        }
        else
        {
            System.out.println("NOT BALANCED");
        }
    }

    private static boolean checkBalanceBrac(String s) {
        Deque<Character> stack= new ArrayDeque<>();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x==('(') || x==('{') || x==('['))
            {
                stack.push(s.charAt(i));
                continue;
            }
            char check;
            if(stack.isEmpty())
                return false;
            switch (x)
            {
               case '}':
                   check = stack.pop();
                   if (check == '(' || check == '[')
                       return false;
                   break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;


            }
        }

        return stack.isEmpty();
    }
}

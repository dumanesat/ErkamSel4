package stepDefs;

import java.util.*;

public class Try {
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("123421"));
        Integer m=sum(1,2);
        String v="123421";
        int y= Integer.parseInt(v);
        Integer i= Integer.valueOf(v);

    }

    private static boolean isPalindrome(String str) {
        return reverseStr(str).equals(str);
    }
    private static String reverseStr(String str) {
        String reversed="";
        for (int i=str.length()-1; i >=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}

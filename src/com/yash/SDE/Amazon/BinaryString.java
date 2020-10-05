package com.yash.SDE.Amazon;

/*
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
*/

import java.util.Scanner;

public class BinaryString {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) {
                sum = sum+a.charAt(i--) - '0';
            }
            if(j >= 0){
                sum = sum+b.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if(carry == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a="11";
        String b="1";
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();
        System.out.println(addBinary(str1,str2));
    }
}

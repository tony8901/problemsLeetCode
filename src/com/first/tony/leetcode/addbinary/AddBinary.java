package com.first.tony.leetcode.addbinary;

/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

import java.math.BigInteger;

public class AddBinary {
    public AddBinary() {
    }


    public String addBinary(String a, String b) {
        return new BigInteger(a,2).add(new BigInteger(b,2)).toString(2);
    }


    //    public String addBinary(String a, String b){
//        return Integer.toBinaryString(Integer.valueOf(a,2) + Integer.valueOf(b,2));
//    }


    /* Me encontre esto en https://quejava.com/programa-java-para-sumar-dos-numeros-binarios/

        //Two variables to hold two input binary numbers
        long b1, b2;
        int i = 0, carry = 0;

        //This is to hold the output binary number
        int[] sum = new int[10];

        //To read the input binary numbers entered by user
        Scanner scanner = new Scanner(System.in);

        //getting first binary number from user
        System.out.print("Enter first binary number: ");
        b1 = scanner.nextLong();

        //getting second binary number from user
        System.out.print("Enter second binary number: ");
        b2 = scanner.nextLong();

        //closing scanner after use to avoid memory leak
        scanner.close();

        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int)((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        } if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        */
}

package com.first.tony.leetcode.mysqrt;

/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:

0 <= x <= 231 - 1
 */

public class MySqrt {
    public MySqrt() {
    }
/*
    public int betwen(int num){
        if (num == 0) return 0;
        else if (num >= 1 && num < 4) return 1;
        else if (num >= 4 && num < 9) return 2;
        else if (num >= 9 && num < 16) return 3;
        else if (num >= 16 && num < 25) return 4;
        else if (num >= 25 && num < 36) return 5;
        else if (num >= 36 && num < 49) return 6;
        else if (num >= 49 && num < 64) return 7;
        else if (num >= 64 && num < 81) return 8;
        else if (num >= 81 && num < 100) return 9;
        else return 10;
    }

    public int betwen(int num1, int num2){
        int num = Integer.parseInt(String.valueOf(num1) + String.valueOf(num2));
        if (num == 0) return 0;
        else if (num >= 1 && num < 4) return 1;
        else if (num >= 4 && num < 9) return 2;
        else if (num >= 9 && num < 16) return 3;
        else if (num >= 16 && num < 25) return 4;
        else if (num >= 25 && num < 36) return 5;
        else if (num >= 36 && num < 49) return 6;
        else if (num >= 49 && num < 64) return 7;
        else if (num >= 64 && num < 81) return 8;
        else if (num >= 81 && num < 100) return 9;
        else return 10;
    }

    public int mySqrt(int x) {
        if (x < 121) return betwen(x);

        int[] temp = new int[String.valueOf(x).length()];
        for (int i = 0; i < String.valueOf(x).length(); i++) {
            temp[i] = (String.valueOf(x).charAt(i) - '0');
        }
        //12 12
        int resp = 0;
        int iterando = 0;
        int multip = 0;
        int resto = 0;
        if (temp.length % 2 == 0) {
            resp+= betwen(temp[0],temp[1]);
            iterando = resp;
            int concat = Integer.parseInt(String.valueOf(temp[0]) + String.valueOf(temp[1]));
            for (int i = 2; i < temp.length; i = i + 2) {

            }
        }

        return resp;
    }
 */
    //Ni en un millón de años llegaba yo a esta respuesta. Ejercicio pendiente...
    public int mySqrt(int x) {
        long y = 0;
        while(y*y<=x) y++;
        return (int) y-1;
    }
}

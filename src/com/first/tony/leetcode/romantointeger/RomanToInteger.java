package com.first.tony.leetcode.romantointeger;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written
 * as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral
 * for four is not IIII. Instead, the number four is written as IV. Because the one is before the
 * five we subtract it making four. The same principle applies to the number nine, which is written
 * as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 * <p>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 * <p>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

public class RomanToInteger {

    public RomanToInteger() {
    }


    public int value(char r) {
        switch (r) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }


    public int[] values(char[] r) {
        int[] resp = new int[r.length];
        for (int i = 0; i < r.length; i++) {
            resp[i] = value(r[i]);
        }
        return resp;
    }

    public int romanToInt(String s) {
        int suma = 0;
        int[] numbers = values(s.toCharArray());
        if (numbers.length == 1) {
            suma = numbers[0];
        } else {
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    suma += numbers[i + 1] - numbers[i];
                    i++;
                    if(i == numbers.length-2){
                        suma+=numbers[i+1];
                    }
                } else {
                    suma += numbers[i];
                    if(i == numbers.length-2){
                        suma+=numbers[i+1];
                    }
                }
            }
        }
        return suma;
    }

}

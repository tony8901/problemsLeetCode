package com.first.tony;

import com.first.tony.leetcode.plusone.PlusOne;

public class Main {
    public static void main (String[] args){

        PlusOne x = new PlusOne();
        int[] digits = {9,9,9};
        for (int i : x.plusOne(digits)){
            System.out.print(i + "_");
        }
    }
}

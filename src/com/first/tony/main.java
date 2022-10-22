package com.first.tony;

import com.first.tony.leetcode.TwoSum.TwoSum;
import com.first.tony.leetcode.ispalindrome.IsPalindrome;
import com.first.tony.leetcode.longestcommonprefix.LongComPrefix;
import com.first.tony.leetcode.removeduplicates.RemoveDuplicates;
import com.first.tony.leetcode.romantointeger.RomanToInteger;
import com.first.tony.leetcode.validparentheses.IsValid;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main (String[] args){

        RemoveDuplicates x = new RemoveDuplicates();
        int[] nums = {-1,0,0,0,0,3,3};
        System.out.println(x.removeDuplicates(nums));
        for (int y : nums) System.out.print(y + " ");
    }
}

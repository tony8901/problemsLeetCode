package com.first.tony;
import com.first.tony.leetcode.removeelement.RemoveElement;
public class main {
    public static void main (String[] args){

        RemoveElement x = new RemoveElement();
        int[] nums = {3,3};
        int val = 5;
        System.out.println(x.removeElement(nums,val));
        System.out.print("[ ");
        for (int y : nums) System.out.print(y + " ");
        System.out.println("]");
    }
}

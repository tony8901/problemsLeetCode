package com.first.tony;
import com.first.tony.leetcode.removeelement.RemoveElement;
import com.first.tony.leetcode.searchinsertposition.SearchInsertPosition;

public class main {
    public static void main (String[] args){

        SearchInsertPosition x = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int val = 7;
        System.out.println(x.searchInsert(nums,val));
        System.out.print("[ ");
        for (int y : nums) System.out.print(y + " ");
        System.out.println("]");
    }
}

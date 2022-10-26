package com.first.tony.leetcode.removeelement;

public class RemoveElement {
    public RemoveElement() {
    }


    //funciona pero es un mounstruo, tengo que mejorar infinitamente mi logica
    public int removeElement(int[] nums, int val) {
        int k = 0;
        if(nums.length == 0 || nums.length == 1 && nums[0] == val) return k;
        else if(nums.length == 1 && nums[0] != val) return ++k;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != val){
                if(i == nums.length-2 && nums[nums.length-1] != val) k++;
                k++;
            } else {
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        k++;
                        break;
                    } else if (j == nums.length - 1) {
                        return ++k;
                    }
                }
            }
        }
        return k;
    }

    /*Respuesta en el foro de discusion (hay que revisarla pero creo que es la mas optima)
    public int removeElement(int[] nums, int val) {

    int nextPosition = 0;

    for(int i=0; i<nums.length; i++) {
        if(nums[i] != val) {
            nums[nextPosition] = nums[i];
            nextPosition++;
        }
    }
    return nextPosition;
}
    * */

}

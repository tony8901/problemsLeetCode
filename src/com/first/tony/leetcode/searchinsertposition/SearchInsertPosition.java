package com.first.tony.leetcode.searchinsertposition;

/**
 Dada una matriz ordenada de enteros distintos y un valor objetivo, devuelve el
 índice si se encuentra el objetivo. Si no, devuelve el índice donde estaría si
 se insertara en orden.
 Debe escribir un algoritmo con  O(log n)complejidad de tiempo de ejecución.

 Ejemplo 1:
 Entrada: nums = [1,3,5,6], destino = 5
 Salida: 2

 Ejemplo 2:
 Entrada: nums = [1,3,5,6], objetivo = 2
 Salida: 1

 Ejemplo 3:
 Entrada: nums = [1,3,5,6], destino = 7
 Salida: 4

 Restricciones:
 1 <= nums.length <= 10^4
 -10^4 <= nums[i] <= 10^4
 nums contiene valores distintos ordenados en orden ascendente .
 -10^4 <= target <= 10^4
 */


public class SearchInsertPosition {
    public SearchInsertPosition() {
    }

    public int searchInsert(int[] nums, int target) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(target <= nums[i]) return i;
            else index++;
        }
        return index;
    }

}

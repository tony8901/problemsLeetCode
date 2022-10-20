package com.first.tony.leetcode.TwoSum;

/**
 * Dada una matriz de números enteros nums y un número entero target, devuelva los índices
 * de los dos números de modo que sumen target .

 * Puede suponer que cada entrada tendría exactamente una solución y no puede usar el mismo
 * elemento dos veces.

 * Puede devolver la respuesta en cualquier orden.

 * Ejemplo 1:

 * Entrada: nums = [2,7,11,15], destino = 9
 *  Salida: [0,1]
 *  Explicación: Como nums[0] + nums[1] == 9, devolvemos [0, 1].
 * Ejemplo 2:

 * Entrada: nums = [3,2,4], objetivo = 6
 *  Salida: [1,2]
 * Ejemplo 3:

 * Entrada: nums = [3,3], objetivo = 6
 *  Salida: [0,1]

 * Restricciones:

 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Sólo existe una respuesta válida.
 */

public class TwoSum {
    public TwoSum() {
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}

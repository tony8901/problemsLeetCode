package com.first.tony.leetcode.removeduplicates;

/**
 Dada una matriz de enteros nums ordenada en orden no decreciente , elimine los
 duplicados en el lugar de modo que cada elemento único aparezca solo una vez.
 El orden relativo de los elementos debe mantenerse igual .

 Dado que es imposible cambiar la longitud de la matriz en algunos idiomas, debe
 colocar el resultado en la primera parte de la matriz nums. Más formalmente, si hay
 k elementos después de eliminar los duplicados, entonces los primeros k elementos nums
 deberían contener el resultado final. Da igual lo que dejes más allá de los primeros  k elementos.

 Regrese k después de colocar el resultado final en las primeras k ranuras de nums.

 No asigne espacio extra para otra matriz . Debe hacer esto modificando la matriz de entrada
 en el lugar con memoria adicional O(1).

 Juez personalizado:

 El juez probará su solución con el siguiente código:

 int[] números = [...]; // Matriz de entrada
 int[] númerosesperados = [...]; // La respuesta esperada con la longitud correcta

 int k = removeDuplicates(nums); // Llama a su implementación

 si k == númerosesperados.longitud;
 for (int i = 0; i < k; i++) {
    afirmar números[i] == númerosesperados[i];
 }
 Si se aprueban todas las afirmaciones, se aceptará su solución.

 Ejemplo 1:
 Entrada: nums = [1,1,2]
 Salida: 2, nums = [1,2,_]
 Explicación: Su función debe devolver k = 2, siendo los primeros dos elementos
 de nums 1 y 2 respectivamente.
 No importa lo que dejes más allá de la k devuelta (por lo tanto, son guiones bajos).

 Ejemplo 2:
 Entrada: números = [0,0,1,1,1,2,2,3,3,4]
 Salida: 5, números = [0,1,2,3,4,_,_,_,_, _]
 Explicación: Su función debería devolver k = 5, siendo los primeros cinco elementos
 de nums 0, 1, 2, 3 y 4 respectivamente.
 No importa lo que dejes más allá de la k devuelta (por lo tanto, son guiones bajos).

 Restricciones:
 1 <= nums.length <= 3 * 104
 -100 <= nums[i] <= 100
 nums se ordena en orden no decreciente .
 */

public class RemoveDuplicates {
    public RemoveDuplicates() {
    }

    /*ejemplo: [-1,0,0,0,0,3,3]
    * resultado esperado: [-1,0,3]
    *                     k = 3
    * */
    public int removeDuplicates(int[] nums) {
        int k =1;
        if(nums.length == 1) return k;

        int max = nums[nums.length-1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i+1]) {
                k++;
            } else{
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] > nums[i]){
                        nums[i+1] = nums[j];
                        k++;
                        if(nums[j] == max) return k;
                        break;
                    }
                }
            }
        }
        return k;
    }

}

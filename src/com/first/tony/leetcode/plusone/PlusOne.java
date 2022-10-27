package com.first.tony.leetcode.plusone;

/*
Se le da un entero grande representado como una matriz de enteros "digits",
donde cada uno digits[i] es el dígito del entero. Los dígitos están ordenados
de más significativos a menos significativos en orden de izquierda a derecha.
El entero grande no contiene ningún cero inicial.

Incremente el entero grande en uno y devuelva la matriz de dígitos resultante.



Ejemplo 1:
Entrada: dígitos = [1,2,3]
 Salida: [1,2,4]
 Explicación: La matriz representa el número entero 123.
Incrementando en uno da 123 + 1 = 124.
Por lo tanto, el resultado debería ser [1,2,4].

Ejemplo 2:
Entrada: dígitos = [4,3,2,1]
 Salida: [4,3,2,2]
 Explicación: La matriz representa el número entero 4321.
Incrementando en uno da 4321 + 1 = 4322.
Por lo tanto, el resultado debería ser [4,3,2,2].
Ejemplo 3:

Entrada: dígitos = [9]
 Salida: [1,0]
 Explicación: La matriz representa el número entero 9.
Incrementando en uno da 9 + 1 = 10.
Por lo tanto, el resultado debería ser [1,0].

249
250

Restricciones:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digit no contiene ningún 0 inicial.
 */

public class PlusOne {
    public PlusOne() {
    }

    public int[] plusOne(int[] digits) {
        boolean flag = false;
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] == 9){
                digits[i] = 0;
                flag =true;
                if(i == 0){
                    int[] temp = new int[digits.length+1];
                    for (int j = 0; j < temp.length; j++) {
                        if(j==0) temp[j] = 1;
                        else temp[j] = digits[j];
                        return temp;
                    }
                }
            } else if(flag){
                digits[i]++;
                return digits;
            } else if(i == digits.length-1) {
                digits[i]++;
                return digits;
            }
        }
        return digits;
    }
}

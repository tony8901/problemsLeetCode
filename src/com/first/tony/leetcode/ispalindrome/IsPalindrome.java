package com.first.tony.leetcode.ispalindrome;

/**
 * Dado un entero x, devuelve true si x es un entero palíndromo.

 * Un número entero es un palíndromo cuando se lee igual hacia atrás que hacia adelante.

 * Por ejemplo, 121 es un palíndromo mientras 123 no lo es.

 * Ejemplo 1:

 * Entrada: x = 121
 *  Salida: verdadero
 *  Explicación: 121 se lee como 121 de izquierda a derecha y de derecha a izquierda.

 * Ejemplo 2:

 * Entrada: x = -121
 *  Salida: falso
 *  Explicación: De izquierda a derecha, se lee -121. De derecha a izquierda, se convierte en 121-.
 *  Por lo tanto no es un palíndromo.

 * Ejemplo 3:

 * Entrada: x = 10
 *  Salida: falso
 *  Explicación: Lee 01 de derecha a izquierda. Por lo tanto no es un palíndromo.

 * Restricciones:

 * -231 <= x <= 231 - 1
 */

public class IsPalindrome {
    public IsPalindrome() {
    }

    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        int[] y = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            y[i] = temp.charAt(i) - '0';
        }

        boolean resp = true;
        int num = y.length;

        //una buena manera de recorrer un arreglo...
        for (int j : y) {
            if (j != y[num - 1]) {
                resp = false;
            }
            num--;
        }
        return resp;
    }

}

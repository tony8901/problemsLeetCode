package com.first.tony.leetcode.validparentheses;

import java.util.Stack;

/**
 * Dada una cadena s que contiene solo los caracteres '(', ')', '{', '}','[' y ']' determine
 * si la cadena de entrada es válida.

 * Una cadena de entrada es válida si:

 * Los corchetes abiertos deben cerrarse con el mismo tipo de corchetes.
 * Los corchetes abiertos deben cerrarse en el orden correcto.
 * Cada paréntesis cerrado tiene un paréntesis abierto correspondiente del mismo tipo.

 * Ejemplo 1:
 * Entrada: s = "()"
 *  Salida: verdadero

 * Ejemplo 2:
 * Entrada: s = "()[]{}"
 *  Salida: verdadero

 * Ejemplo 3:
 * Entrada: s = "(]"
 *  Salida: falso

 * Restricciones:

 * 1 <= s.length <= 104
 * s consta de paréntesis solamente '()[]{}'.
 */

public class IsValid {
    public IsValid() {
    }

    public boolean isValid(String s) {
        if(s.length() %2 != 0) return false;

        Stack stack = new Stack();
        char[] brackets;
        brackets = s.toCharArray();

        for (char bracket : brackets){
            if(bracket == '(' || bracket == '[' || bracket == '{'){
                stack.push(bracket);
            } else {
                if (!stack.isEmpty()){
                    char temporal = (char) stack.pop();
                    if(bracket == ')' && temporal != '('){
                        return false;
                    } if(bracket == ']' && temporal != '['){
                        return false;
                    } if(bracket == '}' && temporal != '{'){
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

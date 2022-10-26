package com.first.tony.leetcode.lengthoflastword;

/*Dada una cadena s que consta de palabras y espacios, devuelve la
longitud de la última palabra de la cadena.
Una palabra es una subcadena máxima que consta únicamente de caracteres que no son espacios.

Ejemplo 1:
Entrada: s = "Hello World"
 Salida: 5
 Explicación: La última palabra es "World" con longitud 5.

Ejemplo 2:
Entrada: s = "   fly me   to   the moon  "
 Salida: 4
 Explicación: La última palabra es "moon" con longitud 4.
Ejemplo 3:

Entrada: s = "luffy is still joyboy"
 Salida: 6
 Explicación: La última palabra es "joyboy" con una longitud de 6.


Restricciones:
1 <= s.length <= 10^4
s consta únicamente de letras y espacios en inglés ' '.
Habrá al menos una palabra en s.
 */

public class LengthOfLastWord {
    public LengthOfLastWord() {
    }


    public int lengthOfLastWord(String s) {
        String[] splittedWords = s.split(" ");
        return splittedWords[splittedWords.length-1].length();
    }

    //pense que era el tamanno de la palabra mas larga, es solo el tamanno de la ultima
    //esta funcion hace su trabajo, solo que eso no es lo que me piden.

    /*
    public int lengthOfLastWord(String s) {
        int length = 0;
        String[] splittedWords = s.split(" ");
        for (int i = 0; i < splittedWords.length; i++) {
            if(splittedWords[i].length() >= length) length = splittedWords[i].length();
        }

        return length;
    }
    */
}

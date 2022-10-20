package com.first.tony.leetcode.longestcommonprefix;

/**
 * Escriba una función para encontrar la cadena de prefijo común más larga entre una matriz de cadenas.
 * <p>
 * Si no hay un prefijo común, devuelve una cadena vacía "".
 * <p>
 * Ejemplo 1:
 * <p>
 * Entrada: strs = ["flower","flow","flight"]
 * Salida: "fl"
 * <p>
 * Ejemplo 2:
 * <p>
 * Entrada: strs = ["dog","racecar","car"]
 * Salida: ""
 * Explicación: No hay un prefijo común entre las cadenas de entrada.
 * <p>
 * Restricciones:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consta únicamente de letras minúsculas en inglés.
 * <p>
 * Segun Google:
 * Se denota como |w|(donde w es una cadena) y se define como el número de símbolos
 * que componen la cadena. Los prefijos están formados por los primeros símbolos de
 * la cadena; y los sufijos, por los últimos . Un prefijo o sufijo de una cadena que
 * no sea la misma cadena es un prefijo o sufijo propios
 */

public class LongComPrefix {
    public LongComPrefix() {
    }

    public String longestCommonPrefix(String[] strs) {
        String resp = "";
        if (strs.length > 0) {
            String fisrtWorld = strs[0];
            for (int i = 1; i < strs.length; i++) {
                while(strs[i].indexOf(fisrtWorld) != 0){
                    fisrtWorld = fisrtWorld.substring(0,fisrtWorld.length()-1);
                    if(fisrtWorld.isEmpty()){
                        return resp;
                    }
                }
            }
            resp=fisrtWorld;
        }
        return resp;
    }

    /* Solucion propuesta en leetcode
    */
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }



}

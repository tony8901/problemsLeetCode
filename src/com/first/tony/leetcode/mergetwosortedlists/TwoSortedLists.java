package com.first.tony.leetcode.mergetwosortedlists;


/**
 * Se le dan los encabezados de dos listas enlazadas ordenadas list1y list2.
 * Combinar las dos listas en una lista ordenada . La lista debe hacerse empalmando
 * los nodos de las dos primeras listas.
 * Devuelve el encabezado de la lista enlazada fusionada .

 * Ejemplo 1:
 * Entrada: lista1 = [1,2,4], lista2 = [1,3,4]
 *  Salida: [1,1,2,3,4,4]

 * Ejemplo 2:
 * Entrada: lista1 = [], lista2 = []
 *  Salida: []

 * Ejemplo 3:
 * Entrada: lista1 = [], lista2 = [0]
 *  Salida: [0]

 * Restricciones:
 * El número de nodos en ambas listas está en el rango [0, 50].
 * -100 <= Node.val <= 100
 * Ambos list1 y list2 están ordenados en orden no decreciente .
 */

public class TwoSortedLists {
    public TwoSortedLists() {
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resp= new ListNode();

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if(list1.val <= list2.val) {
            resp.val = list1.val;
            resp.next = mergeTwoLists(list1.next, list2);
        }
        else {
            resp.val = list2.val;
            resp.next = mergeTwoLists(list1, list2.next);
        }
        return resp;
    }

}

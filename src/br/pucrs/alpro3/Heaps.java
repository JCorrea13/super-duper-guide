package br.pucrs.alpro3;

import java.util.Arrays;

public class Heaps {

    /*
                     1
                 2      3
               4   5

                      50
                 40        30
              20     10  *    *
            *    *  *  *
     */
    public static void main(String[] args) {
        System.out.println("Heaps");
//        int v[] = {1, 2, 3, 4, 5};
        //          0   1   2   3   4
        int v[] = {50, 40, 30, 20};
        System.out.println(Arrays.toString(v));
        System.out.println(isMaxHeap(v));

    }

    private static boolean isMaxHeap(int[] v) {
        for (int i = 0 ; i < v.length; i++) {
            int esq = 2*i + 1;
            int dir = esq + 1;

            if (esq < v.length && v[i] < v[esq])
                return false;

            if (dir < v.length && v[i] < v[dir])
                return false;
        }
        return true;
    }
}

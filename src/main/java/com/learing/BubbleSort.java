package com.learing;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[] { 5, 8, 4, 1, 5, 8, 3 }; //n

        /*

        5 8 4 1 5 8 3
        5 4 1 5 8 3 8
        4 1 5 5 3 8 8
        1 4 5 3 5 8 8
        1 4 3 5 5 8 8
        1 3 4 5 5 8 8
        1 3 4 5 5 8 8 -> нет перестановок


        memory: O(n)
        time: O(n^2)


        устойчивость - если равные элементы в процессе сортировки не меняют порядок между собой
        stable


        a(r, 5), a(g, 5), a(y, 3)
        ->
        a(y, 3), a(r, 5), a(g, 5)
        OR
        a(y, 3), a(g, 5), a(r, 5)

         */



        boolean hasChanges = true;
        while (hasChanges) {
            hasChanges = false;
            for (int i = 0; i < arr.length - 1; i++) {
                int current = arr[i];
                int next = arr[i + 1];
                if (current > next) { //swap
                    arr[i] = next;
                    arr[i + 1] = current;
                    hasChanges = true;
                }
            }
        }

        System.out.println(arr);

    }

}

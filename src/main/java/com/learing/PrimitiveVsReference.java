package com.learing;

public class PrimitiveVsReference {

    public static void main(String[] args) {
        int x = 1;
        printAndIncrement(x);
        System.out.println(x);

        int[] arr = new int[] { 5, 2, 3 };
        printAndIncrement(arr);
        for (int v : arr) {
            System.out.println(v);
        }
    }

    static void printAndIncrement(int y) {
        System.out.println(y);
        y++;
    }

    static void printAndIncrement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arr[i]++;
        }
    }

}

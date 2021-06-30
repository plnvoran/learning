package com.learing;

public class Recursion {

    public static void main(String[] args) {
        print("hello", 10);
    }

    static void print(String s, int times) {
        if (times > 0) {
            System.out.println(s);
            print(s, times - 1);
        }
    }

    //n >= 1
    //fact(n) = 1 * 2 * ... * n
    static int factIter(int n) {
        int result = 1;
        for (int i = 2; i < n; i++) {
            result *= i;
        }
        return result;
    }

    //fact(n) = 1 * 2 * ... * (n-1) * n =
    // = (1 * 2 * .. * (n-1)) * n
    // = fact(n-1) * n, n > 1
    //fact(1) = 1


    //factRec(3) =
    //factRec(2) * 3 =
    //(factRec(1) * 2) * 3 =
    //(1 * 2) * 3 =
    //2 * 3 =
    //6
    static int factRec(int n) {
        if (n == 1) {
            return 1;
        }
        return factRec(n - 1) * n;
    }

}

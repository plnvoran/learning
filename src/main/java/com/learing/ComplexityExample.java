package com.learing;

public class ComplexityExample {

    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("hello world");
        //O(n)

         //f(n) = O(g(n))    def    f(n) / g(n) -> C != 0, n -> +inf

        //100 + 1 + 5 -> 100
        //10 000 + 1 + 15 -> 10 000

        //O(1) - const
        //O(5) = O(1)
        //O(log n)    log (10) = 1,   log(10 000) = 4
        //O(n) - linear
        //O(n * log n)
        //O(n^2)

        //O(n^2)
        int n = 10;
        int counter1 = 0;
        int counter2 = 0;
        while (counter1 < n) {
            while (counter2 < n) {
                int result = counter1 * counter2;
                System.out.println(counter1 + " x " + counter2 + " = " + result);
                counter2++;
            }
            counter2 = 0;
            counter1++;
        }
    }

}

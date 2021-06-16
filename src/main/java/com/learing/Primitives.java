package com.learing;

public class Primitives {

    public static void main(String[] args) {
        //java - static strong typing
        int x; //declaration variable
        //System.out.println(x);
        x = 1; // = - assign (write) operator,  1 - literal,  (x, 1) - operand -> binary operator
        //initialization
        System.out.println(x);
        x = 2;

        {
            int y;
            y = 2;
        }
        //System.out.println(y);

        //Primitive types
        byte by = 1; //[-128;127], integer values
        short sh = 1;
        char ch = 'a';
        int i = 1;
        long lo = 1L;

        float fl = 1.0f;
        double dob = 1.0f;

        boolean bo = true && false;

        x = (x + 2) * 3;
        int z = x++; //x = x + 1;    x += 1;

        if (true && true) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        int counter = 0;
        while (counter < 5) {
            System.out.println(counter);
            counter++;
        }

        //fori
        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                break;
            }
            System.out.println(j);
        }
    }

    static int sum(int x, int y) { //name + parameter types = signature
        return x + y;
    }

    static void prettyPrint(int x) {
        System.out.println("----");
        System.out.println(x);
        System.out.println("++++");
    }

}

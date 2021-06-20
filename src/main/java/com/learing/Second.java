package com.learing;

public class Second {

    public static void main(String[] args) {

        int[] myArray = {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};
        char [] l = {5, 3, 5, 3, 4, 4, 3, 2, 5, 4};

        // Example 1
        System.out.println("Среднее значение массива");
        printArray(myArray);
        System.out.println("Отсортирован массив:");
        sorting((myArray));
        printArray(myArray);
        System.out.println("Среднее значение:");
        System.out.println(averageValueOfArray(myArray));

        //Example 2
        System.out.println("Максимальная разница квадратов элементов");
        System.out.println("Массив в квадрате:");
        square(myArray);
        printArray(myArray);
        System.out.println("Результат: " + maxDiff(myArray));

        //Example 3
        String stringOne = "rotor";
        String stringTwo = "abba";
        String stringThird = "selenium";
        char[] charDem;

        charDem=stringTOChar("rotor");
        printArray(charDem);
        System.out.println("Полиандром: "+isPoliandrom(charDem));
        charDem=stringTOChar("selenium");
        printArray(charDem);
        System.out.println("Полиандром: "+isPoliandrom(charDem));
        charDem=stringTOChar("abba");
        printArray(charDem);
        System.out.println("Полиандром: "+isPoliandrom(charDem));

    }
    static char[]  stringTOChar(String str) {
        char[] charArray = str.toCharArray();
        return charArray;
    }

    static String isPoliandrom(char[] l) {

        int lenHalf = l.length / 2;

        String result = "yes";
        for(int i = 0, j = l.length-1; i <lenHalf; i++, j--) {

            if (l[i]!=l[j])
            {
                result = "no";
                break;

            }
        }

            return result;

    }

    static int averageValueOfArray(int[] myArray) {
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];

        }

        return (sum / myArray.length);

    }

    static int square(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.pow(myArray[i], 2);
        }
        return myArray[myArray.length - 1] - myArray[0];
    }

    static int maxDiff(int[] myArray) {

        return myArray[myArray.length - 1] - myArray[0];

    }

    static void sorting(int[] myArray) {
        boolean hasChanges = true;
        while (hasChanges) {
            hasChanges = false;
            for (int i = 0; i < myArray.length - 1; i++) {
                int current = myArray[i];
                int next = myArray[i + 1];
                if (current > next) { //swap
                    myArray[i] = next;
                    myArray[i + 1] = current;
                    hasChanges = true;
                }
            }
        }

    }

    static void printArray(int[] myArray) {
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println();

    }
    static void printArray(char[] myArray) {
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println();
    }
}

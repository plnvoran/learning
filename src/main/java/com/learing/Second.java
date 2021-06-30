package com.learing;

public class Second {

    public static void main(String[] args) {

        int[] myArray = {5, 3, 5, 3, 4, 4, 3, 2, 5, 33};

        printArray(myArray);

        // 1. Метод принимает на вход массив целых чисел, должен вернуть среднее значение элементов
        System.out.printf("Среднее значение: %1.2f \n", averageValueOfArray(myArray));
        // 2. Метод принимает на вход массив целых чисел, должен вернуть максимальную из разниц квадратов его элементо
        System.out.println("Максимальная разница квадратов элементов: " + maxDiff(myArray));

        //3. Задан массив символов: a..z + пробелы. Требуется установить, является ли он палиндромом
        String stringOne = "rotor";
        String stringTwo = "ro tor".replace(" ", "");
        String stringThird = "mama";
        String stringForth = "selenium";

        System.out.println(stringOne+" Полиандром ? "+ isPalindrome(stringOne));
        System.out.println(stringTwo +" Полиандром ? "+ isPalindrome(stringTwo ));
        System.out.println(stringThird+" Полиандром ? "+ isPalindrome(stringThird));
        System.out.println(stringForth +" Полиандром ? "+ isPalindrome(stringForth));


    }
    //"abbc"
    //"abba"
    //"aba"
    //" abc "

    public static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        if (charArray.length == 0) {
            return true;
        }
        int leftIndex = 0;
        int rightIndex = charArray.length - 1;
        while (leftIndex < rightIndex) {
            char leftValue = charArray[leftIndex];
            char rightValue = charArray[rightIndex];
            if (leftValue == ' ') {
                leftIndex++;
            } else if (rightValue == ' ') {
                rightIndex++;
            } else if (leftValue != rightValue) {
                return false;
            }
        }
        return true;

    }

    static double averageValueOfArray(int[] myArray) {
        if (myArray.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int j : myArray) {
            sum += j;
        }
        return (1.0 * sum) / myArray.length;
    }



    static int maxDiff(int[] myArray) {

        //O(n) : 100 -> 100, 1_000_000 -> 1_000_000
        //O(n^2): 100 -> 10_000; 1_000_000 -> 1_000_000_000_000
        int minSquare = 0;
        int maxSquare = 0;
        for (int value : myArray) {
            int square = value * value;
            minSquare = Math.min(minSquare, square);
            maxSquare = Math.max(maxSquare, square);
        }
        return maxSquare - minSquare;
    }

    static void printArray(int[] myArray) {
        System.out.println("Дан массив:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println();

    }
}

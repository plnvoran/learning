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
        String stringTwo = "ro t or";
        String stringThird = "mama";
        String stringForth = "selenium";

        System.out.println(stringOne+" Полиандром ? "+ isPalindrome(stringOne));
        System.out.println(stringTwo +" Полиандром ? "+ isPalindrome(stringTwo ));
        System.out.println(stringThird+" Полиандром ? "+ isPalindrome(stringThird));
        System.out.println(stringForth +" Полиандром ? "+ isPalindrome(stringForth));


    }

    static boolean isPalindrome(String str) {

        char[] charArray= str.toCharArray();
        int lenHalf = charArray.length / 2;

        Boolean result = true;
        for(int i = 0, j = charArray.length-1; i <lenHalf; i++, j--) {
            int left = charArray[i]- '0';
            int right = charArray[j]- '0';

            if( left!=right )

            {
                result = false;
                break;

            }
        }

        return result;

    }

    static float averageValueOfArray(int[] myArray) {
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];

        }
        float avg = (float) (sum) / (float) (myArray.length);
        return avg;

    }



    static int maxDiff(int[] myArray) {

        int d = 0;
        int max = 0;
        for (int i = 0; i < myArray.length; i++) {

            for (int j = i + 1; j < myArray.length; j++) {
                d = (myArray[i] * myArray[i]) - (myArray[j] * myArray[j]);
                if (d > max)
                    max = d;
            }
        }
        return max;

    }

    static void printArray(int[] myArray) {
        System.out.println("Дан массив:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println();

    }
}

package ru.prokhorov.java.basic.otus.lesson4;

import java.util.Arrays;


public class Lesson4 {
    public static void main(String[] args) {
        numberAndString(2, "Тяжело в учении, легко в бою");
        sumFive(3, 4, 7, 9, 19, 34, 73, 1, 1, 1, 1, 2);
        int[] arr = new int[4];
        fillCell(2, 1, 4, 6, 8);
        int[] arr1 = new int[4]; // вот костыль ли это, если я прошу в heap занять 4 блока, а ссылаюсь в методе
        // на аргумент переменной длины?
        plusEveryElement(3, 4, 8, 2, 8);
        halfMore(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);


    }

    public static void numberAndString(int number, String... str) {
        for (int i = 1; i <= number; i++) {
            System.out.println(Arrays.toString(str));
        }
    }

    public static void sumFive(int... array) {
        int moreThanFive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                moreThanFive++;
            }
        }
        System.out.println(moreThanFive);

    }

    public static void fillCell(int cell, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != cell) ;
            arr[i] = cell;

        }
        System.out.println(cell);
        System.out.println(Arrays.toString(arr));
    }

    public static void plusEveryElement(int plus, int... arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) { // шутка, блок массива не может быть меньше 0 :D
                arr1[i] += plus;
            }

        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void halfMore(int... array2) {
        int firstHalf = 0;
        int secondHalf = 0;

        for (int i = 0; i < array2.length / 2; i++) {
            firstHalf += array2[i];
        }
        for (int i = array2.length / 2; i < array2.length; i++) {
            secondHalf += array2[i];
        }
        if (firstHalf > secondHalf) {
            System.out.println(" первая половина массива больше ");
        } else if (firstHalf < secondHalf) {
            System.out.println(" вторая половина массива больше ");
        } else {
            System.out.println(" равны ");
        }

    }
}






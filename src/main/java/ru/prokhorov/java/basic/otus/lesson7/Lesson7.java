package ru.prokhorov.java.basic.otus.lesson7;


public class Lesson7 {
    public static void main(String[] args) {
        int[][] arr = {{-1, 3, 6}, {-4, -8, 2}};
        int result = sumOfPositiveElements(arr);
        System.out.println("sumOfPositiveElements = " + result);
        squareStar(7);
        char[][] array = new char[10][10];
        diagonalLine(array, '_');
        int result1 = findMax(arr);
        System.out.println("findMax = " + result1);
        int result2 = sumElementsSecondLine(arr);
        System.out.println("sumElements2String = " + result2);
    }

    public static int sumElementsSecondLine(int[][] arr) {
        if (arr.length < 2){
            return -1;
        }
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
            }
        }
        return sum;
    }

    public static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void diagonalLine(char[][] array, char value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                if (i == j || i + j == array.length - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void squareStar(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* " + " ");
            }
            System.out.println();
        }
    }
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum++;
                }
            }

        }
        return sum;
    }
}

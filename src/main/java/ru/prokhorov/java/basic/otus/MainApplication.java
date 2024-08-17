package ru.prokhorov.java.basic.otus;


public class MainApplication {
    public static void main(String[] args) {
        String[][] array = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","67"},{"4","4","2","1"}};
        try {
            myArray(array);
        } catch (AppArraySizeException e) {
            System.out.println("Ошибка " + e.getMessage());
        } catch (AppArrayDataException e) {
            System.out.println("Ошибка данных " + e.getMessage());
        }

    }
    static void myArray (String[][] arr) throws AppArraySizeException, AppArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new AppArraySizeException("Нужен массив 4на4");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]: " + arr[i][j] +
                            " не является числом.");
                }
            }
        }
        System.out.println("сумма массива = " + sum);
    }
}

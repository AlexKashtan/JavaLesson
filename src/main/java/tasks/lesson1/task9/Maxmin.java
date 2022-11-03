package tasks.lesson1.task9;

import java.util.Random;

public class Maxmin implements MethodsForTask{
    public int maximum(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public int minimum(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public int summary(int[] array) {
        int summaryArray = 0;
        for (int i = 0; i < array.length; i++) {
            summaryArray += array[i];
        }
        return summaryArray;
    }

    public int[] massiveGeneration(int value) {
        Random rndm = new Random();
        int[] array = new int[value];

        for (int m = 0; m < array.length; m++) {
            array[m] = rndm.nextInt(100);// принять диапазон в метод
        }
        return array;
    }

    static int average(int[] array) {
        int averageTotal = 0;
        int summaryArray = 0;
        for (int i = 0; i < array.length; i++) {
            summaryArray += array[i];
        }
        averageTotal = summaryArray / array.length;
        return averageTotal;
    }

    public static int[] invert(int[] array) {// переделать через середину массива
        int arrayTimely[] = new int[array.length];
        for (int i = array.length - 1; i > 0; ) {
            for (int q = 0; q < array.length; q++) {
                arrayTimely[q] = array[i];
                i--;
            }
        }
        return arrayTimely;
    }
}

package tasks.lesson1.task9;

import java.util.Arrays;
import java.util.Scanner;
//9. Создать массив из трех чисел, вводимых с консоли.
//Посчитать сумму всех чисел в массиве
//Определить максимальное и минимальное значение содержащееся в массиве и вывести на консоль

public class Task9 implements MethodsForTask{
    public static void main(String[] args) {
        int[] myArrayNine = new int[3];
        Scanner console = new Scanner(System.in);
        for (int p = 0; p < myArrayNine.length; p++) {
            System.out.println("Введите элемент массива № " + (p + 1));
            myArrayNine[p] = console.nextInt();
        }
        System.out.println(Arrays.toString(myArrayNine));

        Maxmin massive = new Maxmin();
        massive.average(myArrayNine);
        System.out.println("Сумма массива: " + massive.summary(myArrayNine));
        System.out.println("Максимальное число: " + massive.maximum(myArrayNine));
        System.out.println("Минимальное число: " + massive.minimum(myArrayNine));
    }

    @Override
    public int maximum(int[] array) {
        return 0;
    }
}

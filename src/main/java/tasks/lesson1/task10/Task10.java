package tasks.lesson1.task10;

import tasks.lesson1.task9.Maxmin;

import java.util.Arrays;
import java.util.Random;

//Task 10
//Создать массив из n чисел(не более 100)
//Сделать функцию заполения массива рандомными числами.
//Вывести  в консоль среднее арифметические чисел содержащихся в массиве
public class Task10 extends Maxmin{
    public static void main(String[] args) {
        Maxmin massive = new Maxmin();
        int arrayTask10[] = massive.massiveGeneration(100);
        average(arrayTask10);

        System.out.println(Arrays.toString(arrayTask10));
        System.out.println("Cреднее арифметическое: " + (massive.average(arrayTask10)));
    }
}

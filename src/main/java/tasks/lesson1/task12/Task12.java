package tasks.lesson1.task12;

import tasks.lesson1.task9.Maxmin;

import java.util.Arrays;

//Создать массив размером 12 заполненный рандомно числами от 0 до 100
//Инвертировать массив
//Вывести результат в консоль
public class Task12 {
    public static void main(String[] args) {
        Maxmin massiveTask12 = new Maxmin();
        int arrayTask12[] = massiveTask12.massiveGeneration(12);
        System.out.println(Arrays.toString(arrayTask12));
        int arrayTask12Invert[] = massiveTask12.invert(arrayTask12);
        System.out.println(Arrays.toString(arrayTask12Invert));
    }
}

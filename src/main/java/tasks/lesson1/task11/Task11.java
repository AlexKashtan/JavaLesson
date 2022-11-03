package tasks.lesson1.task11;

import java.util.Arrays;

//Task 11
//Создать двумерный массив размером 9х9
//Заполнить массив числами по формуле: (позиция в столбце +1)*( номер строки +1)
//Вывести значения массива в консоль
public class Task11 {
    public static void main(String[] args) {
        int arrayTask11[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int q = 0; q < 9; q++) {
                arrayTask11[i][q] = (i + 2) * (q + 2);
            }
        }

        System.out.println(Arrays.deepToString(arrayTask11)); //вывести каждую строку массива с новой строки в консоле
    }
}

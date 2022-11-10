package tasks.lesson1.task13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Task 13
//Создать массив заданного размера,
//Заполнить рандомными числами,
//Отсортировать массив по возрастанию и убыванию.
public class Task13 {
    public static void main(String[] args) {
        // задать размерность массива из консоли
        int indexSt, indexCo;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите кол-во строк:");
        indexSt = console.nextInt();
        System.out.println("Введите кол-во столбцов:");
        indexCo = console.nextInt();

        int[][] myArray = new int[indexSt][indexCo];
        Random rndm = new Random();

        // генерация массива
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = rndm.nextInt(100);// принять диапазон в метод
            }
        }

        // вывод массива в консоль
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(Arrays.toString(myArray[i]));
        }
        //System.out.println(Arrays.deepToString(myArray));
//        Random rnd = new Random();
//        int number = rnd.nextInt(100);
//        System.out.println("Random number: " + number);

        // сортировка массива
        for (int i = 0; i < myArray.length; i++) {
            boolean needToSort = false;
            while (!needToSort) {
                needToSort = true;
                for (int j = 1; j < myArray[i].length; j++) {
                    if (myArray[i][j - 1] > myArray[i][j]) {
                        int temp = myArray[i][j];
                        myArray[i][j] = myArray[i][j - 1];
                        myArray[i][j - 1] = temp;
                        needToSort = false;
                    }
                }

            }

        }


        System.out.println("Массив после сортировки:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(Arrays.toString(myArray[i]));
        }

    }
    //все реализации чего-то делать в методах


}

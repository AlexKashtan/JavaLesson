package tasks.lesson1.task13;

import java.util.Arrays;
import java.util.Random;
//Task 13
//Создать массив заданного размера,
//Заполнить рандомными числами,
//Отсортировать массив по возрастанию и убыванию.
public class Task13 {
    public static void main(String[] args) {
        int [][] myArray = new int[10][10];// задать размерность массива из консоли
        //System.out.println(Arrays.deepToString(myArray));
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        System.out.println("Random number: " + number);


    }
    //Сортировку писать самому!


}

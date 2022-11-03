package tasks.lesson1.task1;

public class Task1 {
    public static void main(String[] args) {
        //    Task 1
//    Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//    день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//    суммарный путь пробежит спортсмен за 7 дней?

        double firstDistance = 10;
        double percent = 1.10;
        double summaryDistance = 0;
        for (int d = 0; d < 7; d++) {
            summaryDistance = firstDistance + summaryDistance * percent;
        }
        System.out.println("Спортсмен пробежал за 7 дней " + String.format("%.3f", summaryDistance) + "км");
        // ответ лучше до 0,0001 String.format("%.3f", value)
    }
}

package tasks.lesson1.task1;
//    Task 1
//    Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
//    день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
//    суммарный путь пробежит спортсмен за 7 дней?
public class Task1 {
    public static void main(String[] args) {

        double firstDistance = 10;
        double percent = 1.10;
        distance(firstDistance, percent);
    }

    static void distance(double firstDistance, double percent) {
        double summaryDistance = 0;
        for (int d = 0; d < 7; d++) {
            summaryDistance = firstDistance + summaryDistance * percent;
        }
        System.out.println("Спортсмен пробежал за 7 дней " + String.format("%.3f", summaryDistance) + "км");
    }


}

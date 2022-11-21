package tasks.lesson1.task18;

public class Student {
    String firstName, lastName, group;
    double averageMark;

    public int getScholarship(double averageMark) {
        if (averageMark == 5) {
            System.out.println(100);
            return 100;
        } else {
            System.out.println(80);
            return 80;
        }
    }
}

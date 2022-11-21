package tasks.lesson1.task18;

public class Aspirant extends Student{
    public int getScholarship(double averageMark) {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}

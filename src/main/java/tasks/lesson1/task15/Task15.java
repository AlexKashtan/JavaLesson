package tasks.lesson1.task15;

public class Task15 {
    public static void main(String[] args) {
        Phone nokia = new Phone();
        Phone iphone = new Phone();
        Phone sony = new Phone();

        nokia.receiveCall("Alex");
        nokia.getNumber();

        iphone.receiveCall("Paul");
        iphone.getNumber();

        sony.receiveCall("Nick");
        sony.getNumber();

        nokia.receiveCall("Rick", "+571099571");

        nokia.sendMessage("111", "545", "458");
    }
}

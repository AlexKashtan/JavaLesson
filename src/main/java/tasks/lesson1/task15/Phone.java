package tasks.lesson1.task15;

import tasks.lesson1.task14.Person;
//11. Инициализировать конструктор с 3 и двумя взодными параметрами. Добавить геттеры на все поля.
public class Phone {
    private String number;
    private String model;
    private double weight;

    public void receiveCall(String name) {
        System.out.println("Звонить " + name);
    }

    public String getNumber() {
        return number;
    }

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
        System.out.println("Конструктор без параметров");
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонить " + name + " по номеру " + number);
    }

    public void sendMessage(String... var) {// add new value
        for (int i = 0; i < var.length; i++) {
            System.out.println(var[i]);
        }
    }

}

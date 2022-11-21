package tasks.lesson1.task16;

public class Person {
    String fullName; // need private
    int age;

    // add setter
    public void move() {
        System.out.println("Такой-то  Person говорит");//Person = fullName
    }

    public void talk() {
        System.out.println("Такой-то " + fullName + " говорит");
    }

    Person() {
        System.out.println("объект инициализируется конструктором Person()");
    }

    Person(String fullName, int age) {
        System.out.println("объект инициализируется конструктором Person(" + fullName + ", " + age + ")");
    }
}

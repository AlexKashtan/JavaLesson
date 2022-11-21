package tasks.lesson1.task17;

public class Reader {
    String fullName;
    String numberTicket;
    String faculty;
    String birthday;
    String numberPhone;

    String[] arrayR;

    public void takeBook() {
    }


    public void returnBook() {
    }


    public String[] arrayReader(String fullName, String numberTicket, String faculty, String birthday, String numberPhone) {
        arrayR = new String[]{fullName, numberTicket, faculty, birthday, numberPhone};
        return arrayR;
    }

    public void takeBook(int countBook) {

        System.out.println("Петров В. В. взял " + countBook + " книги");
    }

    public void takeBook(String... nameBook) {//добавить контекатенацию на всю строку
        System.out.print("Петров В. В. взял книги: ");
        for (int i = 0; i < nameBook.length - 1; i++) {
            System.out.print(nameBook[i] + ", ");
        }
        System.out.println(nameBook[nameBook.length - 1] + ".");

    }

    public void takeBook(Book... nameBook) {//изменить принимаепые парметры на тира Book

        System.out.print("Петров В. В. взял книги: ");
        for (int i = 0; i < nameBook.length - 1; i++) {
            System.out.print(nameBook[i] + ", ");
        }
        System.out.println(nameBook[nameBook.length - 1] + ".");
    }

    public void returnBook(int countBook) {

        System.out.println("Петров В. В. вернул " + countBook + " книги");
    }

    public void returnBook(String... nameBook) {
        System.out.print("Петров В. В. вернул книги: ");
        for (int i = 0; i < nameBook.length - 1; i++) {
            System.out.print(nameBook[i] + ", ");
        }
        System.out.println(nameBook[nameBook.length - 1] + ".");

    }

    public void returnBook(Book... nameBook) {
        System.out.print("Петров В. В. вернул книги: ");
        for (int i = 0; i < nameBook.length - 1; i++) {
            System.out.print(nameBook[i] + ", ");
        }
        System.out.println(nameBook[nameBook.length - 1] + ".");
    }

}

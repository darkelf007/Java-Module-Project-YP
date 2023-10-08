import java.util.Scanner;

public class Persons {

    public String countPersons() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите на сколько человек разделить счет?");
        String persons;

        while (true) {
            persons = scanner.nextLine();
            try {
                int number = Integer.parseInt(persons);
                if (number <= 1) {
                    System.out.println("Некорректоное значение для подсчета");
                } else if (number > 1) {
                    break;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Ошибка: Введенный текст не является числом.");
            }
        }
        System.out.println("Вы ввели " + persons);

        return persons;
    }
}
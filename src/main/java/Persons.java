import java.util.Scanner;

public class Persons {

    public void countPersons () {
        Scanner scanner = new Scanner(System.in);                                           //входные параметры
        System.out.println("Здравствуйте, на сколько человек разделить счет?");

     static int getPersons;
        while (true) {
            String persons = scanner.nextLine();

            try {
                Integer number = Integer.parseInt(persons);
                int personCount = 0;
                personCount = number;


                if (number <= 1) {
                    System.out.println("Не корректоное значение для подсчета");
                } else if (number > 1) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введенный текст не является числом.");
            }
        }
        }
    }
}

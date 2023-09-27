import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                           //входные параметры
        System.out.println("Здравствуйте, на сколько человек разделить счет?");

        while (true) {
            String persons = scanner.nextLine();

            try {
                Integer number = Integer.parseInt(persons);
                int personCount =0;
                personCount = number;

                if (number <= 1) {
                    System.out.println("Не корректоное значение для подсчета");
                }
                else if (number > 1) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введенный текст не является числом.");
            }
        }
        calulator();


    }

    public static void calulator() {
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);
        String format = "%.2f";

        while (true) {

            System.out.println("Введите наименоване товара (или 'Звершить' для завершения)");
            String productName = scanner.nextLine().trim();

            if (productName.equalsIgnoreCase("Завершить")) {
                break;
            }

            System.out.println("Введите стоимость товара в формате руб.копейки");
            String inputPrice = scanner.nextLine().trim();
            float price = Float.parseFloat(inputPrice);
            total += price;

            System.out.println("Хотите добавить еще одну позицию?\nВыберети вариант и наберите номер ответа.\n1. ДА\n2. НЕТ");
            String question = scanner.nextLine().trim();

            if (question.equalsIgnoreCase("1")) {
                continue;
            }

            if (question.equalsIgnoreCase("2")) {
                break;
            }
        }

        System.out.println("Общая стоимость всех товаров =" + String.format(format,total)+ "Руб.");

    }
}
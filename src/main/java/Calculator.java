import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public void calculator() {
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);
        String format = "%.2f";

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        outerLoop:
        while (true) {
            System.out.println("Введите наименование товара (или 'Завершить' для завершения)");

            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("Завершить")) {
                break;
            }
            products.add(name);

            double priceNum;

            while (true) {
                System.out.println("Введите стоимость товара в формате руб.копейки");

                try {
                    String priceInput = scanner.nextLine().trim().replace(',', '.');
                    priceNum = Double.parseDouble(priceInput);

                    if (priceNum <= 0) {
                        System.out.println("Введите положительное число");
                    } else {
                        prices.add(priceNum);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nОшибка: Введенный текст не является числом.\n");
                }
            }

            total += priceNum;

            while (true) {
                System.out.println("Хотите добавить еще одну позицию?\nВыберети вариант и наберите номер ответа.\n1. ДА\n2. НЕТ");
                String question = scanner.nextLine().trim();

                if (question.equalsIgnoreCase("1")) {
                    break;
                } else if (question.equalsIgnoreCase("2")) {
                    break outerLoop;
                } else {
                    System.out.println("\nНе верно. Введите только 1 или 2.\n");
                }
            }
        }
        System.out.println("\nCписок продуктов:");

        for (int i=0; i<products.size(); i++){
            String product = products.get(i);
            double priceСonversion = prices.get(i);

            System.out.printf("Товар: " + product + " Стоимость %.2f " , priceСonversion );
            System.out.println(Ruble.getRuble(priceСonversion));
        }
        System.out.print("\nОбщая стоимость всех товаров = " + String.format(format,total));
        System.out.println(" " + Ruble.getRuble(total) + "\n");

        Persons person = new Persons();
        double conversion = Double.parseDouble(person.countPersons());
        double division = total / conversion;

        System.out.printf("Итого с каждого по: %.2f ", division);
        System.out.println(Ruble.getRuble(division));
    }
}
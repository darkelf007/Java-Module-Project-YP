import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public void calculator() {
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);
        String format = "%.2f";

        ArrayList<String> products = new ArrayList<>();
        ArrayList<String> prices = new ArrayList<>();

        while (true) {
            System.out.println("Введите наименоване товара (или 'Завершить' для завершения)");

            String name = scanner.nextLine().trim();
            products.add(name);

            if (name.equalsIgnoreCase("Завершить")) {
                break;
            }

            float priceNum;

            while(true) {
                System.out.println("Введите стоимость товара в формате руб.копейки");

                try {
                    String price;
                    price = scanner.nextLine().trim();
                    priceNum= Float.parseFloat(price);
                    if (priceNum <= 0) {
                        System.out.println("Введите положительное число");
                    } else {
                        prices.add(price);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: Введенный текст не является числом.");
                }
            }

        total += priceNum;

            System.out.println("Хотите добавить еще одну позицию?\nВыберети вариант и наберите номер ответа.\n1. ДА\n2. НЕТ");
            String question = scanner.nextLine().trim();

            if (question.equalsIgnoreCase("1")) {
                continue;
            }
            if (question.equalsIgnoreCase("2")) {
                break;
            }
        }
        System.out.println("Cписок продуктов:");

        for (int i=0; i<products.size(); i++){
            String product = products.get(i);
            float priceСonversion = Float.parseFloat(prices.get(i));

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
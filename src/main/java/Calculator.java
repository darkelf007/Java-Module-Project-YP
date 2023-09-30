import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public void caclulator() {
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);
        String format = "%.2f";

        ArrayList<String> products = new ArrayList<>();
        ArrayList<String> prices = new ArrayList<>();

        while (true) {

            System.out.println("Введите наименоване товара (или 'Звершить' для завершения)");

            List productNameList = new List ("","");

            productNameList.name= scanner.nextLine().trim();
            products.add(productNameList.name);

            if (productNameList.name.equalsIgnoreCase("Завершить")) {
                break;
            }

            System.out.println("Введите стоимость товара в формате руб.копейки");

            productNameList.price=scanner.nextLine().trim();
            float priceNum = Float.parseFloat(productNameList.price);
            prices.add(productNameList.price);

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

        System.out.println("список продуктов:");

        for (int i=0; i<products.size(); i++){
            String product = products.get(i);
            float price2 = Float.parseFloat(prices.get(i));

            System.out.print(String.format("Товар: " + product + " Стоимость %.2f " , price2 ));
            System.out.println(Ruble.getRuble(price2));
            System.out.println("");
            System.out.print("Общая стоимость всех товаров = " + String.format(format,total));
            System.out.println(Ruble.getRuble(total));

            System.out.println("Итого с каждого по: ");

        }
    }
}

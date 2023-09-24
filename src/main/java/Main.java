import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек разделить счет?");
        while (true){
            int persons = scanner.nextInt();
            if ( persons <=1 ) {
                System.out.println("Не корректоное значение для подсчета");
            }
            if (persons>1){
                break;
            }
        }
    }
}
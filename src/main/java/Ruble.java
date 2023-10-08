public class Ruble {

    public static String getRuble(double rubles) {
        int count = (int) rubles % 100;
        if (count > 4 && count < 21)
            return "Рублей";
        switch (count % 10) {
            case 1:
                return "Рубль";
            case 2:
            case 3:
            case 4:
                return "Рубля";
            default:
                return "Рублей";
        }
    }
}
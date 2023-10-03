public class Ruble {

    public static String getRuble(double rubles){

        int correct = (int) Math.floor(rubles);
        int count = correct%100;
        switch (count) {
            case  1:
            case 21:
            case 31:
            case 41:
            case 51:
            case 61:
            case 71:
            case 81:
            case 91:
                return "Рубль";

            case 2:
            case 22:
            case 32:
            case 42:
            case 52:
            case 62:
            case 72:
            case 82:
            case 92:
            case 3:
            case 23:
            case 33:
            case 43:
            case 53:
            case 63:
            case 73:
            case 83:
            case 93:
            case 4:
            case 24:
            case 34:
            case 44:
            case 54:
            case 64:
            case 74:
            case 84:
            case 94:
                return "Рубля";

            default:
                return "Рублей";
        }
    }
}
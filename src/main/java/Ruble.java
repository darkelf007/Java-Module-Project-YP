public class Ruble {

    public static String getRuble(double rubles){

        int correct = (int) Math.floor(rubles);
        int count = correct%10;
        if (count == 1){
            return "Рубль";
        }
         if(count >= 2 && count <=4){
            return "Рубля";
        }
         else if (count>=5 && count<=9 ){
            return "Рублей";
        }

         else  {
            return "Рублей";
        }
    }
}

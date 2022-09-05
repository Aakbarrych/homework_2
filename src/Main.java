import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(12,-1));
        System.out.println(ageAndTemperature(17,18));
        System.out.println(ageAndTemperature(38,31));
        System.out.println(ageAndTemperature(24,12));
        System.out.println(ageAndTemperature(generateRandomAge(),30));
    }

    public static String ageAndTemperature (int age, int temperature)
    {
        if (20 <= age && age <= 45 && temperature >= -20 && temperature <= 30){
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28){
            return "Можно идти гулять";
        } else if(age > 45 && temperature >= -10 && temperature <= 25 ){
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }

    public static int generateRandomAge(){
        Random random = new Random();
        int someRandomAge = random.nextInt(100);
        return someRandomAge;
    }
}
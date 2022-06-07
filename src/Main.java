import java.util.Random;

public class Main {


    public static void main(String arg[]) {
        System.out.println(1);
        System.out.println(agePerson(generateRandomAge(), 45));
        System.out.println(2);
        System.out.println(agePerson(generateRandomAge(), 15));
        System.out.println(3);
        System.out.println(agePerson(generateRandomAge(), 20));
        System.out.println(4);
        System.out.println(agePerson(generateRandomAge(), 19));
        System.out.println(5);
        System.out.println(agePerson(generateRandomAge(),32));


    }

    public static String agePerson(int ageMan, int tempStreet) {
        if (ageMan >= 20 && ageMan <= 45 || tempStreet >= -20 && tempStreet <= 30) {
            return "можно  идти гулять ";
        } else if (ageMan <= 20 && tempStreet >= 0 || tempStreet <= 28) {
            return "можно идти гулять ";
        } else if (tempStreet < -10 || tempStreet <= 25 && ageMan >= 45) {
            return "можно идти гулять ";
        } else {
            return "оставайтесь  дома";
        }

    }

    public static int generateRandomAge() {
        Random random = new Random();
        int randomNumbers = random.nextInt(100) + 1;
        return randomNumbers;
    }


}





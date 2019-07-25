import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int myNumber = random.nextInt(1001);
        boolean amIWin = false;

        System.out.println("Я загадал число между 0 и 1000. Попробуешь угадать?");
        System.out.println("Со скольки попыток ты это сделаешь?");

        int maxRetry = scanner.nextInt();

        System.out.println("Ну попробуй");

        while (maxRetry > 0){

            System.out.println(String.format("У тебя есть %d попыток", maxRetry));

            int yourNumber = scanner.nextInt();

            if(yourNumber > myNumber){
                System.out.println("меньше!!!");
            } else if(yourNumber < myNumber){
                System.out.println("больше!!!");
            } else {
                amIWin = true;
                break;
            }

            maxRetry--;

        }

        if(amIWin){
            System.out.println("Ты победил");
        } else {
            System.out.println(String.format("Ты не угадал, число было %d", myNumber));
        }

    }
}

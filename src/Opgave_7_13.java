import java.util.Random;
import java.util.Scanner;

public class Opgave_7_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The random int is " + getRandom(numbers));
    }

    public static int getRandom(int[] array) {

        Random rand = new Random();

        int randomInt = array[rand.nextInt(10)];

        return randomInt;
    }
}

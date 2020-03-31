import java.util.Scanner;

public class Opgave_7_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter ten doubles: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The average of the array is " + average(numbers));
    }

    public static double average(double[] array) {

        double sum = 0;

        for (int i = 0; i < array.length ; i++) {
            sum =+ array[i];
        }

        return (sum / array.length);
    }
}

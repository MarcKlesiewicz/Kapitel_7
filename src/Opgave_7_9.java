import java.util.Scanner;

public class Opgave_7_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The maximum number is " + max(numbers));
    }

    public static double max(double[] array) {

        double max = array[0];

        for (int i = 0; i < array.length ; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }


}

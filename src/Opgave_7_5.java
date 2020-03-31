import java.util.Scanner;

public class Opgave_7_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;
        int[] numbers = new int[10];


        System.out.println("Enter numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }

        }

        System.out.println("The number of odd numbers: " + oddCount);
        System.out.println("The number of even numbers: " + evenCount);

    }
}

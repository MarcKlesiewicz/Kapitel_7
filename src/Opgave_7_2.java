import java.util.Scanner;

public class Opgave_7_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 11 integers: ");

        int num[] = new int[11];

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();

        }

        System.out.println(num[1] + " is " + checkValue(num[1], num[10]) + " than " + num[10]);
        for (int i = 0; i < num.length ; i++) {

            System.out.println(num[i] + " is " + checkValue(num[i], num[10]) + " than " + num[10]);
        }

    }

    public static String checkValue(int value, int masterValue) {

        String answer = "";

        if (value < masterValue){
            answer = "smaller";
        }else if (value == masterValue){
            answer = "equal";
        }else {
            answer = "greater";
        }
        return (answer);
    }
}

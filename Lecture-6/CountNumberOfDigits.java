import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int sum = 0;

            while (number > 0) {
                sum += 1;
                number /= 10;
            }

            System.out.println("You entered " + sum + " digit number.");
        }
    }
}

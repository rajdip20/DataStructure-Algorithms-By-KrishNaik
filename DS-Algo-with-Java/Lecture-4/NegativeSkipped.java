import java.util.Scanner;

public class NegativeSkipped {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number > 0) {

                System.out.println("You entered a positive number.");
            } else {

                System.out.println("Your number is negative and is skipped.");
            }
        }
    }
}

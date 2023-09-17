import java.util.Scanner;

public class EvenDivByThree {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number % 2 == 0 && number % 3 == 0) {

                System.out.println("The number is Even and Divisible by 3.");
            }
        }
    }
}

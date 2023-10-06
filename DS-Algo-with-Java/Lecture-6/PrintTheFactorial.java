import java.util.Scanner;

public class PrintTheFactorial {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt(), fact = 1;

            for (int i = 1; i<=number; i++) {
                fact *= i;
                System.out.println("Factorial of " + i + " is: " + fact);
            }
        }
    }
}

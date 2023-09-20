import java.util.Scanner;

public class SumForLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            System.out.println("Sum of first " + number + " natural number is = " + sum);
        }
    }
}

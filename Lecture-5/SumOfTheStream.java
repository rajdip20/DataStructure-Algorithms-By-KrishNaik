import java.util.Scanner;

public class SumOfTheStream {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first value: ");
            int num1 = sc.nextInt();
            System.out.print("Enter last value: ");
            int num2 = sc.nextInt();
            int sum = 0;

            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
            System.out.println("Sum of " + num1 + " to " + num2 + " is = " + sum);
        }
    }
}

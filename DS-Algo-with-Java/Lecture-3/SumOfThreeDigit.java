import java.util.Scanner;

public class SumOfThreeDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a 3 digit number = ");
            int number = sc.nextInt();
            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            System.out.println(sum);
        }
    }
}

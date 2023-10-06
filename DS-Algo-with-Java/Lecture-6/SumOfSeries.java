import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter maximum frequency: ");
            int number = sc.nextInt(), sum = 0;

            for (int i = 1; i <= number; i++) {

                if (i % 2 != 0) {
                    sum += i;
                } else {
                    sum -= i;
                }
            }

            System.out.println("Sum of 1 to " + number + " is: " + sum);
        }
    }
}

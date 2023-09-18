import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Using if-else

            // if (number % 2 == 0) {
            //     System.out.println(number + " is an Even number.");
            // } else {
            //     System.out.println(number + " is an Odd number.");
            // }

            // Using Ternary Operator

            String result = (number % 2 == 0) ? "Even" : "Odd";
            System.out.println(result);
        }
    }
}
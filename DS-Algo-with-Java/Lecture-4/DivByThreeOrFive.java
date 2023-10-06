import java.util.Scanner;

public class DivByThreeOrFive {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number % 3 == 0 || number % 5 == 0) {

                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("The number is divisible by 3 and 5.");
                } else if (number % 3 == 0) {

                    System.out.println("The number is divisible by 3.");
                } else {
                    
                    System.out.println("The number is divisible by 5.");
                }
            }
        }
    }
}

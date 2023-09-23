import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt(), mul = 1;

            if (num == 0) {
                System.out.println("Factorial of 0 = 0");
            } else {
                for (int i = 1; i <= num; i++) {
                    mul *= i;
                }
                System.out.println("Factorial of " + num + " = " + mul);
            }
        }
    }
}

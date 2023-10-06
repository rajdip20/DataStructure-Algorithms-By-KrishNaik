import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a Decimal number: ");
            int number = sc.nextInt();
            int power = 1, binary = 0;

            while (number > 0) {
                int rem = number % 2;
                binary += rem * power;
                power *= 10;
                number /= 2;
            }
            System.out.println(binary);
        }
    }
}

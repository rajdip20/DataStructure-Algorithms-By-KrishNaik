import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a Binary number: ");
            int number = sc.nextInt();
            int rem, dec = 0, power = 0;

            while (number > 0) {
                rem = number % 10;
                if (rem == 0 || rem == 1) {
                    dec += rem * Math.pow(2, power);
                }
                number /= 10;
                power++;
            }

            if (dec > 0) {
                System.out.println("The Decimal number is: " + dec);
            } else {
                System.out.println("Enter valid Binary number");
            }
        }
    }
}

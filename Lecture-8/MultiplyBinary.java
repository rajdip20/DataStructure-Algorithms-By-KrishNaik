import java.util.Scanner;

public class MultiplyBinary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter 1st binary number: ");
            String binary1 = sc.next();
            System.out.print("Enter 2nd binary number: ");
            String binary2 = sc.next();

            int num1 = Integer.parseInt(binary1, 2);
            int num2 = Integer.parseInt(binary2, 2);

            int multiply = num1 * num2;
            String result = Integer.toBinaryString(multiply);

            System.out.print(binary1 + " x " + binary2 + " = " + result);
        }
    }
}

import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        String binary1, binary2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st binary number: ");
            binary1 = sc.next();
            System.out.print("Enter 2nd binary number: ");
            binary2 = sc.next();

            int num1 = Integer.parseInt(binary1, 2);
            int num2 = Integer.parseInt(binary2, 2);
            int sum = num1 + num2;

            String result = Integer.toBinaryString(sum);
            System.out.print(binary1 + " + " + binary2 + " = " + result);
        }
    }
}
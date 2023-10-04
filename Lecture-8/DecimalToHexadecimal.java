import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a decimal number: ");
            int dec = sc.nextInt();
            String result = Integer.toHexString(dec);

            System.out.print(dec + " = " + result);
        }
    }
}

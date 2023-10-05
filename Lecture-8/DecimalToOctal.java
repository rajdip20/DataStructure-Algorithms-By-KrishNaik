import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a decimal number: ");
            int dec = sc.nextInt();

            String result = Integer.toOctalString(dec);

            System.out.println(dec + " = " + result);
        }
    }
}

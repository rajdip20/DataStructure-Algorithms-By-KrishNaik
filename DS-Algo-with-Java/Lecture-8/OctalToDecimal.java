import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter an octal number: ");
            String octal = sc.next();
            int decimal = Integer.parseInt(octal, 8);

            System.out.println(octal + " = " + decimal);
        }
    }
}

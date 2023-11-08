import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an Octal number: ");
            String octal = sc.next();
            String hexadecimal = Integer.toHexString(Integer.parseInt(octal, 8));

            System.out.println(octal + " = " + hexadecimal);
        }
    }
}

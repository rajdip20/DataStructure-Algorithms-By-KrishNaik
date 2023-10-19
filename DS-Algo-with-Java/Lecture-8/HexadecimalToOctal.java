import java.util.Scanner;

public class HexadecimalToOctal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a Hexadecimal number: ");
            String hex = sc.next();
            String octal = Integer.toOctalString(Integer.parseInt(hex, 16));

            System.out.println(hex + " = " + octal);
        }
    }
}

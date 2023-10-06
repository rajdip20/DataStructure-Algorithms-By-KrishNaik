import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a binary number: ");
            String binary = sc.next();
            String octal = Integer.toOctalString(Integer.parseInt(binary, 2));

            System.out.println(binary + " = " + octal);
        }
    }
}

import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a binary number: ");
            String binary = sc.next();
            String result = Integer.toHexString(Integer.parseInt(binary, 2));

            System.out.println(binary + " = " + result);
        }
    }
}

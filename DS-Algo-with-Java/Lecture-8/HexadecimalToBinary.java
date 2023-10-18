import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a Hexadecimal number: ");
            String hex = sc.next();
            String binary = Integer.toBinaryString(Integer.parseInt(hex, 16));

            System.out.println(hex + " = " + binary);
        }
    }
}

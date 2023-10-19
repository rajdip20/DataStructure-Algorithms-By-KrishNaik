import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter an Octal number: ");
            String octal = sc.next();
            String binary = Integer.toBinaryString(Integer.parseInt(octal, 8));

            System.out.println(octal + " = " + binary);
        }
    }
}

import java.util.Scanner;

public class GivenASCIIValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            System.out.println("The ASCII value of " + ch + " is = " + (int)ch);
        }
    }
}

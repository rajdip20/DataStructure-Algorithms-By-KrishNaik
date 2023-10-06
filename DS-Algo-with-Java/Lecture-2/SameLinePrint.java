import java.util.Scanner;

public class SameLinePrint {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First String: ");
            String firstString = sc.nextLine();

            System.out.print("Enter Second String: ");
            String secondString = sc.nextLine();

            System.out.println("String in the same line is: " + firstString + secondString);
        }
    }
}

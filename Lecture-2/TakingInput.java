import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Name: ");
            String name = sc.nextLine();
            System.out.println("Name is: " + name);

            System.out.print("Enter a number: ");
            int num_1 = sc.nextInt();
            System.out.println("Entered number is: " + num_1);
        }
    }
}

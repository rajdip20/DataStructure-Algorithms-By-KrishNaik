import java.util.Scanner;

public class EqualToThird {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input the first number: ");
            int a = sc.nextInt();
            System.out.print("Input the second number: ");
            int b = sc.nextInt();
            System.out.print("Input the third number: ");
            int c = sc.nextInt();

            if (a + b == c) {
                System.out.println("The result is: true");
            } else {
                System.out.println("The result is: false");
            }
        }
    }
}

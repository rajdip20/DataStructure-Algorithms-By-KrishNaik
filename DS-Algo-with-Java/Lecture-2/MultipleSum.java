import java.util.Scanner;

public class MultipleSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of Test Cases: ");
            int t = sc.nextInt();

            for (int i=0; i<t; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                System.out.println(x + y);
            }
        }
    }
}

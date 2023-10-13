import java.util.Scanner;

public class Algebra {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            int ans = add(a, b);
            System.out.println("Sum: " + ans);
        }
    }

    public static int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}
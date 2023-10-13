import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            System.out.print("Enter the third number: ");
            int c = sc.nextInt();
            System.out.print(avg(a, b, c));
        }
    }

    public static int avg(int a, int b, int c) {
        return (a+b+c)/3;
    }
}

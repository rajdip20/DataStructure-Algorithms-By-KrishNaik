import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            System.out.print("Enter the third number: ");
            int c = sc.nextInt();
            System.out.print(smallest(a, b, c));
        }
    }

    public static int smallest(int a, int b, int c){
        return Math.min(a, Math.min(b,c));
    }
}

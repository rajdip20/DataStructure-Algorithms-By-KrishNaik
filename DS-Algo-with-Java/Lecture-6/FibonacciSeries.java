import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter maximum frequency: ");
            int num = sc.nextInt();
            int a = 1, b = 1;

            for (int i = 1; i <= num; i++) {
                
                System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;
            }
        }
    }
}
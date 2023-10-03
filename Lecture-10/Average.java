import java.util.Scanner;

class InnerAverage {

    int Avg(int a, int b, int c) {
        int ans = (a + b + c) / 3;
        return ans;
    }
}

public class Average {
    public static void main(String[] args) {

        InnerAverage obj = new InnerAverage();
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.print("Enter third number: ");
            int c = sc.nextInt();

            int ans = obj.Avg(a, b, c);
            System.out.println(ans);
        }
    }
}
import java.util.Scanner;

class InnerAlgebra {
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class Algebra {
    public static void main(String[] args) {
        InnerAlgebra obj = new InnerAlgebra();
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            int ans = obj.add(a, b);
            System.out.println("Sum: " + ans);
        }
    }
}
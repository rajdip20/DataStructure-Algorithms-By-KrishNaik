import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter 1st value = ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd value = ");
            int num2 = sc.nextInt();
            
            System.out.println("Before swaping, num1 = " + num1 + ", num2 = " + num2);

            num1 = num2 + num1;
            num2 = num1 - num2;
            num1 = num1 - num2;

            System.out.println("After swaping, num1 = " + num1 + ", num2 = " + num2);
        }
    }
}

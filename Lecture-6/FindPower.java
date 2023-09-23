import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.print("Enter the power: ");
            int power = sc.nextInt();
            int mul = 1;

            for (int i = 1; i <= power; i++) {
                mul *= num;
            }
            
            System.out.println(num + " to the power " + power + " is: " + mul);
        }
    }
}

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age <= 12) {
                System.out.println("Child");

            } else if (age > 12 && age < 18) {
                System.out.println("Teenager");
            
            } else {
                System.out.println("Adult");
            
            }
        }
    }
}

import java.util.Scanner;

public class SquareOrNot {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter length: ");
            int length = sc.nextInt();
            System.out.print("Enter breadth: ");
            int breadth = sc.nextInt();

            if (length == breadth) {
                
                System.out.println("It is a square.");
            } else {

                System.out.println("It is a rectangle.");
            }
        }
    }
}
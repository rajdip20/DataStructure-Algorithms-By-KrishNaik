import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number < 0) {

                int num = number*-1;
                System.out.println("The absolute value of " + number + " is: " + num);
            } else {

                System.out.println("The absolute value of " + number + " is: "+ number);
            }
        }
    }
}

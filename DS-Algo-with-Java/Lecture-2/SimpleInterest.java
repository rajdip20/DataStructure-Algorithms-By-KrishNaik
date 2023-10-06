import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter Principal Amount: ");
            float Principal = sc.nextFloat();

            System.out.print("Enter time in Year: ");
            float year = sc.nextFloat();

            System.out.print("Enter Interest Rate: ");
            float rate = sc.nextFloat();

            float interest = (Principal*year*rate)/100;
            System.out.println("The Simple Interest is: " + interest);
        }
    }
}
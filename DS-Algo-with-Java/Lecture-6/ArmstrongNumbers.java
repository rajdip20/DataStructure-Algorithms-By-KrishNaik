import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int i = 0, rem, num, arm;

            while (i < number) {

                num = i;
                arm = 0;
                while (num > 0) {

                    rem = num % 10;
                    arm = arm + (rem * rem * rem);
                    num /= 10;
                }

                if (arm == i) {

                    System.out.println(i);
                }
                
                i++;
            }
        }
    }
}

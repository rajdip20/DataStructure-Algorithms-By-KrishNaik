import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int num = 1, sum = 0;

            while (num <= number) {

                sum += num;
                num++;
            }
            System.out.println("Sum of first " + number + " natural number is = " + sum);
        }
    }
}
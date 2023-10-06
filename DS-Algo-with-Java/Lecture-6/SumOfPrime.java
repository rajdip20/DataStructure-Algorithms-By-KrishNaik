import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = scn.nextInt();
            if(isPrime(num) && isPrime(num-2)) {
                
                System.out.print(true);
            } else {
                
                System.out.print(false);
            }
        }
    }

    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}

import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter height: ");
            int height = sc.nextInt();
            int num = 3;

            for (int i = 1; i <= height; i++) {

                for (int k = 1; k <= height - i; k++) {
                    System.out.print(" ");
                }

                if (i == 1) {

                    System.out.print(2);
                } else {
                    for (int j = 0; j != i; ) {
                        int prime = 0;
                        for (int l = 2; l < num; l++) { // check if prime or not
                            if ((num % l) == 0)
                                prime = 1; // not prime
                        }
                        if (prime == 0) { // prime
                            j++;
                            System.out.print(num + " ");
                        }
                        num++;
                    }
                }

                System.out.println();
            }
        }
    }
}

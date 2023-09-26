import java.util.Scanner;

public class NumericalHollowPyramid {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter height: ");
            int height = sc.nextInt();

            for (int i = 1; i <= height; i++) {

                for (int k = 1; k <= height - i; k++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= (2 * i) - 1; j++) {

                    if ((i == 1 || i == height) || (j == 1 || j == (2 * i) - 1)) {
                        System.out.print(i);
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }
}

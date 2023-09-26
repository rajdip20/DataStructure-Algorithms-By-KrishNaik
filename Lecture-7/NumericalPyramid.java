import java.util.Scanner;

public class NumericalPyramid {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter height: ");
            int height = sc.nextInt();

            for (int i = 1; i <= height; i++) {

                for (int k = 1; k <= height - i; k++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= (2 * i) - 1; j++) {
                    
                    if (j >= i) {
                        System.out.print((i * 2) - j);
                    } else {
                        System.out.print(j);
                    }
                }

                System.out.println();
            }
        }
    }
}

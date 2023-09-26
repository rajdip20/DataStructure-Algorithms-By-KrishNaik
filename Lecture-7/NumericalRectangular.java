import java.util.Scanner;

public class NumericalRectangular {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter row: ");
            int r = sc.nextInt();

            for (int i = 1; i <= r; i++) {

                for (int j = 0; j < r; j++) {
                    if (i + j > r) {
                        System.out.print((i + j) - r);
                    } else {
                        System.out.print(i + j);
                    }
                }
                System.out.println();
            }
        }
    }
}

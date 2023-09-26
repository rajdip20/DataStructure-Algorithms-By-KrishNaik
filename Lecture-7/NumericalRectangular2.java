import java.util.Scanner;

public class NumericalRectangular2 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter row: ");
            int r = sc.nextInt();
            System.out.print("Enter column: ");
            int c = sc.nextInt();

            for (int i = 1; i <= r; i++) {

                for (int j = 1; j <= c; j++) {

                    System.out.print(j);
                }

                System.out.println();
            }
        }
    }
}

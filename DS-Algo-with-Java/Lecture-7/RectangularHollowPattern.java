import java.util.Scanner;

public class RectangularHollowPattern {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter row number: ");
            int r = sc.nextInt();
            System.out.print("Enter column number: ");
            int c = sc.nextInt();

            for (int i = 1; i <= r; i++) {

                for (int j = 1; j <= c; j++) {

                    if ((i == 1 || i == r) || (j == 1 || j == c)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

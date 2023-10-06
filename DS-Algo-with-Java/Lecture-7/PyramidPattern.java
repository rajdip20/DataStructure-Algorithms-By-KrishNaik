import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the height: ");
            int height = sc.nextInt();

            for (int i = 1; i <= height; i++) {

                for (int k = 0; k < height - i; k++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the height: ");
            int height = sc.nextInt();

            for (int i = height; i >= 1; i--) {

                for (int j = i; j >= 1; j--) {

                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}

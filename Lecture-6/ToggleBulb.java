import java.util.Scanner;

public class ToggleBulb {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter bulb count: ");
            int n = sc.nextInt();
            for (int i = 1; i*i <= n; i++) {
                System.out.print(i*i + " ");
            }
        }
    }
}

import java.util.Scanner;

public class SimplifyTheProblem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            int result = ((((x + 8) / 3) % 5) * 5);
            System.out.println(result);
        }
    }
}

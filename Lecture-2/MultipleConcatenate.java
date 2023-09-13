import java.util.Scanner;

public class MultipleConcatenate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextLine()) {
                String a = sc.next();
                String b = sc.next();

                System.out.println(a + b);
            }
        }
    }
}

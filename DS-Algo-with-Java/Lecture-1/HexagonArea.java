import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the length of a side: ");
            double s = sc.nextInt();
            double ans = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/6));

            System.out.println("The area of the hexagon is: " + ans);
        }
    }
}

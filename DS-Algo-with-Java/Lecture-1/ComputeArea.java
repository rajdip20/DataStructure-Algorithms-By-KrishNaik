import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Input the number of sides on the polygon: ");
            int n = sc.nextInt();

            System.out.print("Input the length of one of the sides: ");
            int s = sc.nextInt();

            double ans = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/n));
            System.out.println("The area is: " + ans);
        }
    }
}

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length: ");
            int length = sc.nextInt();

            System.out.print("Enter Breadth: ");
            int breadth = sc.nextInt();

            int area = returnArea(length, breadth);

            System.out.println("Area is: " + area);
        }
    }

    private static int returnArea(int length, int breadth) {
        int area = length * breadth;
        return area;
    }
}

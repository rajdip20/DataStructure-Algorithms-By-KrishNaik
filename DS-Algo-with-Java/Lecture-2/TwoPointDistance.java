import java.util.Scanner;

public class TwoPointDistance {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Input the latitude of coordinate 1: ");
            double x1 = sc.nextDouble();
            System.out.print("Input the longitude of coordinate 1: ");
            double y1 = sc.nextDouble();
            System.out.print("Input the latitude of coordinate 2: ");
            double x2 = sc.nextDouble();
            System.out.print("Input the longitude of coordinate 2: ");
            double y2 = sc.nextDouble();

            double earthRadius = 6371.01;
            x1 = Math.toRadians(x1);
            y1 = Math.toRadians(y1);
            x2 = Math.toRadians(x2);
            y2 = Math.toRadians(y2);

            double distance = earthRadius * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

            System.out.println("The distance between those points is: " + distance + " km");
        }
    }
}

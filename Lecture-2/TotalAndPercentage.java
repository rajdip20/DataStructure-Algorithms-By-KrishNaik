import java.util.Scanner;

public class TotalAndPercentage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first subject number out of 100: ");
            int num_1 = sc.nextInt();
            System.out.print("Enter second subject number out of 100: ");
            int num_2 = sc.nextInt();
            System.out.print("Enter third subject number out of 100: ");
            int num_3 = sc.nextInt();

            int total = num_1 + num_2 + num_3;
            int percent = total/3;

            System.out.println("Total marks: " + total);
            System.out.println("Percentage marks: " + percent + "%");
        }
    }
}

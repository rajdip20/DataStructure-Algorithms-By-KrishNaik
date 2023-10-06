import java.util.Scanner;

public class ProfitOrLoss {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Cost Price: ");
            int cp = sc.nextInt();
            System.out.print("Enter Selling Price: ");
            int sp = sc.nextInt();

            if (cp > sp) {

                int loss = cp - sp;
                System.out.println("Loss = " + loss);
            } else {

                int profit = sp - cp;
                System.out.println("Profit = " + profit);
            }
        }
    }
}
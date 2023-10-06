import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt(), revnum = 0, rem;

            while (number > 0) {
                rem = (number % 10);
                revnum = revnum * 10 + rem;
                number /= 10;
            }

            System.out.println("Reverse of the number is: " + revnum);
        }
    }
}

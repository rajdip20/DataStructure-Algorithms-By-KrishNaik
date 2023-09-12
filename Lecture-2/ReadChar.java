import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter a Charecter: ");
            char ch = sc.next().charAt(0);

            System.out.println("Charecter is: " + ch);
        }
    }
}

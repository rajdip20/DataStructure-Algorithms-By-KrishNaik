import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            char[] letters = s.toCharArray();
            System.out.print("Reverse string: ");
            for (int i = letters.length - 1; i >= 0; i--) {
                System.out.print(letters[i]);
            }
        }
    }
}

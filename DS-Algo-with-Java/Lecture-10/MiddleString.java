import java.util.Scanner;

public class MiddleString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String s = sc.nextLine();
            System.out.print(middle(s));
        }
    }
    
    public static String middle(String s) {
        if(s.length() % 2 == 0) {
            return s.substring(s.length()/2 - 1, s.length()/2 + 1);
        } else {
            return s.substring(s.length()/2, s.length()/2 + 1);
        }
    }
}

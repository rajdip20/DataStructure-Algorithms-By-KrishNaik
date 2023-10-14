import java.util.Scanner;

public class CountInputString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            
            char[] ch = s.toCharArray();
            int c_count = 0;
            int s_count = 0;
            int n_count = 0;
            int o_count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(ch[i])) {
                    c_count++;
                } else if (Character.isSpaceChar(ch[i])) {
                    s_count++;
                } else if (Character.isDigit(ch[i])) {
                    n_count++;
                } else {
                    o_count++;
                }
            }
            System.out.println("The string is: " + s);
            System.out.println("letter: " + c_count);
            System.out.println("space: " + s_count);
            System.out.println("number: " + n_count);
            System.out.println("other: " + o_count);

        }
    }
}

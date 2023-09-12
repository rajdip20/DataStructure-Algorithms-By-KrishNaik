import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String f_name = sc.next();
            String l_name = sc.next();

            int roll = sc.nextInt();
            String sub = sc.next();

            System.out.println("Name: " + f_name + " " + l_name);
            System.out.println("Roll Number: " + roll);
            System.out.println("Field of interest: " + sub);
        }
    }
}

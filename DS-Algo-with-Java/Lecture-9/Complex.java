import java.util.Scanner;

public class Complex {

    static int r1, r2, i1, i2;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter 1st real and imaginary number separate with space: ");
            r1 = sc.nextInt();
            i1 = sc.nextInt();

            System.out.print("Enter 2nd real and imaginary number separate with space: ");
            r2 = sc.nextInt();
            i2 = sc.nextInt();

            System.out.print("1st number: ");
            Complexprint(r1, i1);
            System.out.print("2nd number: ");
            Complexprint(r2, i2);

            add();
            subtract();
            multiply();
        }
    }

    private static void multiply() {

        int r_mul = (r1 * r2) - (i1 * i2);
        int i_mul = (r1 * i2) + (i1 * r2);
        System.out.print("Multiplication: ");
        Complexprint(r_mul, i_mul);
    }

    private static void subtract() {
        int r_sub = r1 - r2;
        int i_sub = i1 - i2;
        System.out.print("Subtraction: ");
        Complexprint(r_sub, i_sub);
    }

    private static void add() {

        int r_add = r1 + r2;
        int i_add = i1 + i2;
        System.out.print("Addition: ");
        Complexprint(r_add, i_add);
    }

    private static void Complexprint(int r, int i) {

        if (i < 0) {
            System.out.println(r + " - " + (-i) + "i");
        } else {
            System.out.println(r + " + " + i + "i");
        }
    }
}
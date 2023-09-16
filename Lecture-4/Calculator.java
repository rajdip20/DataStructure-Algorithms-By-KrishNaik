import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter an operator (+,-,*,/): ");
            String ch = sc.next();

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (ch) {

                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;

                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case "*":
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;

                case "/":
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;

                default:
                    System.out.println("Enter a valid operator.");
                    break;
            }
        }
    }
}

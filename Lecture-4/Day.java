import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number between 1-7 : ");
            int day = sc.nextInt();

            switch (day) {
                case 1:
                    System.out.println("ohh god!! It's Monday.");
                    break;
                case 2:
                    System.out.println("It's Tuesday.");
                    break;
                case 3:
                    System.out.println("Wednesday here.");
                    break;
                case 4:
                    System.out.println("It's Thursday. Now I want a break.");
                    break;
                case 5:
                    System.out.println("It's Friday. pufff!! at least weekend is near.");
                    break;
                case 6:
                    System.out.println("Hurrey!! It's Saturday.");
                    break;
                case 7:
                    System.out.println("Sunday here... ohh god, back to work from tomorrow.");
                    break;
                default:
                    System.out.println("Seriously!! you want " + day + " day in a week!!");
                    break;
            }
        }
    }
}

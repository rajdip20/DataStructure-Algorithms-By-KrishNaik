import java.util.Scanner;

public class CountOccurrences {

    static int Count(int arr[], int value) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the elements: ");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter value you want to count: ");
            int value = sc.nextInt();

            System.out.println("The value " + value + " occurred " + Count(arr, value) + " times in array.");
        }
    }
}

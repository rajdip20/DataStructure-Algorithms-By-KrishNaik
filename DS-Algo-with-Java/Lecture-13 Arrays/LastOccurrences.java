import java.util.Scanner;

public class LastOccurrences {

    static int Last(int arr[], int value) {

        int location = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                location = i;
            }
        }
        return location;
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

            System.out.print("Enter value for see last occurrence: ");
            int value = sc.nextInt();

            System.out.println("The value " + value + " last occurred at " + Last(arr, value) + " position in array.");
        }
    }
}

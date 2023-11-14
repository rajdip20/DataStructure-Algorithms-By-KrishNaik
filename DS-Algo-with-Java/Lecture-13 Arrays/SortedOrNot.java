import java.util.Scanner;

public class SortedOrNot {

    static boolean isSorted(int arr[]) {
        boolean check = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                check = false;
            }
        }
        return check;
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

            System.out.println("Sorted: " + isSorted(arr));
        }
    }
}

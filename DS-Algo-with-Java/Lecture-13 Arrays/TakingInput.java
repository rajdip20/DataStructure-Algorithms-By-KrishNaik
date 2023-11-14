import java.util.Arrays;
import java.util.Scanner;

public class TakingInput {

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter " + n +" elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Original array");
            printArray(arr);

            // Copy of an array
            int arr2[] = /* arr.clone() or Arrays.copyOf(arr, arr.length) or */ Arrays.copyOfRange(arr, 0, arr.length);
            System.out.println("Copied array");
            printArray(arr2);

            // Changing some values of arr2
            arr2[0] = 0;
            arr2[1] = 0;

            System.out.println("Orginal array after changing arr2.");
            printArray(arr);

            System.out.println("Copied arr2 after changing arr2.");
            printArray(arr2);

        }
    }
}
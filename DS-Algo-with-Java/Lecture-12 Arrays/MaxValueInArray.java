public class MaxValueInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 8, 5, 4};
        int value = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > value) {
                value = arr[i];
            }
        }

        System.out.println("Max: " + value);
    }
}

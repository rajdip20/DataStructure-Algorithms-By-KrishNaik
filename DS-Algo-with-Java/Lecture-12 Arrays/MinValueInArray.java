public class MinValueInArray {
    public static void main(String[] args) {
        int arr[] = {2, -3, 5, 8, 1, 0, -4};
        int result = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}

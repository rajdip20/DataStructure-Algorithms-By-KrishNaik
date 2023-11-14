public class SearchInAray {
    public static void main(String[] args) {
        // Linear Search
        
        int arr[] = {1, 3, 5, 7, 10, 4};

        int found = 7, ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == found) {
                ans = i;
                break;
            }
        }

        System.out.println("Found " + found + " at index " + ans);
    }
}

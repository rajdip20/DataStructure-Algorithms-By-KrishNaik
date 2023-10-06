public class LogicalOperators {
    public static void main(String[] args) {
        int p = 15, q = 10, r = 5;

        // && Operator
        System.out.println((p > q) && (p > r)); // True
        System.out.println((p > q) && (p < r)); // False

        // || Operator
        System.out.println((r < q) || (p < q)); // True
        System.out.println((p > q) || (q > r)); // True
        System.out.println((p < q) || (q < r)); // False

        // ! Operator
        System.out.println(!(p == q));          // True
        System.out.println(!(p > q));           // False
    }
}

class Scope {
    int a = 10; // Member variables or Class level scope
    int b = 5;

    int add() {
        int p = 100;    // Method level scope
        int q = 20;
        return p + q;
    }

    int sub() {
        return a - b;
    }

    void demo() {
        int c = 5;
        System.out.println(c);
//        System.out.println(d);    // Shows an error cause d is an block level scope
        {
            int d = 10;     // Block level scope. examples: Loops, conditions are block level scope.
            System.out.println(d);  // can be accessed in the block.    // print 10
        }
//        System.out.println(d);

        {
            int d = 100;
            System.out.println(d);      // print 100
        }
    }
}

public class ScopeOfVariables {
    public static void main(String[] args) {
        Scope obj = new Scope();
        obj.demo();
    }
}
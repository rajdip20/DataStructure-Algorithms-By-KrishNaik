import java.util.Scanner;

class Test{
    int length;
    int breadth;
    public Test(int l, int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
}


public class Area {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int l,b;

            System.out.print("Enter length: ");
            l = sc.nextInt();
            System.out.print("Enter breadth: ");
            b = sc.nextInt();

            Test obj = new Test(l,b);

            System.out.println("Area: " + obj.getArea());
        }
    }
}

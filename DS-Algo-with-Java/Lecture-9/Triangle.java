public class Triangle {
    int a = 3;
    int b = 4;
    int c = 5;

    public static void main(String[] args) {
        Triangle obj = new Triangle();

        int perimeter = obj.a + obj.b + obj.c;
        int s = perimeter/2;
        double area = Math.sqrt(s * (s - obj.a) * (s - obj.b) * (s - obj.c));

        System.out.println(perimeter);
        System.out.println((int) area);
    }
}

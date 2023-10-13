class Tri {
    int a, b, c;

    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt((s * (s - a) * (s - b) * (s - c)));
    }

    public double getPerimeter() {
        return (a + b + c) / 2.0;
    }
}

public class Triangle {
    public static void main(String[] args){
        Tri obj = new Tri();
        obj.a = 2;
        obj.b = 5;
        obj.c = 6;
        System.out.println(obj.getArea());
        System.out.println(obj.getPerimeter());
    }
}

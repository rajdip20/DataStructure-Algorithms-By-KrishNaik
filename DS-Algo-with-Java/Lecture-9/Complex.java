import java.util.Scanner;

class Calculation{
    int real;
    int imag;
    public Calculation(int r, int i){
        real = r;
        imag = i;
    }
    public static Calculation add(Calculation a, Calculation b){
        return new Calculation((a.real+b.real),(a.imag+b.imag));
    }
    public static Calculation diff(Calculation a, Calculation b){
        return new Calculation((a.real-b.real),(a.imag-b.imag));
    }
    public static Calculation product(Calculation a, Calculation b){
        return new Calculation(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}

class Complex{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter real part of complex number 1: ");
            int real1 = sc.nextInt();
            System.out.print("Enter complex part of complex number 1 without iota sign: ");
            int comp1 = sc.nextInt();
            System.out.print("Enter real part of complex number 2: ");
            int real2 = sc.nextInt();
            System.out.print("Enter complex part of complex number 2 without iota sign: ");
            int comp2 = sc.nextInt();
            Calculation c = new Calculation(real1, comp1);
            Calculation d = new Calculation(real2, comp2);
            Calculation e = Calculation.add(c,d);
            Calculation f = Calculation.diff(c,d);
            Calculation g = Calculation.product(c,d);
            e.printComplex();
            f.printComplex();
            g.printComplex();
        }
    }
}
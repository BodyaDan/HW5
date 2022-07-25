package Second;

public class Main {
    private int a,b;
    private double c,d;
    private String f;

    Main() {
        a = 0;
        b = 1;
        c = 2.1;
        d = 3.2;
        f = "Hello";
    }

    Main (int A) {
        this();
        this.a = A;
    }

    Main (int A, double C, double D) {
        this(A);
        this.c = C;
        this.d = D;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public String getF() {
        return f;
    }
}

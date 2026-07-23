interface Calculator {

    int add(int a, int b);

    default int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }
}

class MyCalculator implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int square(int n) {
        return n * n;
    }
}

public class code30 {

    public static void main(String[] args) {

        MyCalculator obj = new MyCalculator();

        System.out.println("Addition = " + obj.add(10, 20));
        System.out.println("Square = " + obj.square(5));
        System.out.println("Cube = " + Calculator.cube(5));
    }
}
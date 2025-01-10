package OOPS.polymorphism;
class Calculator {
    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class CompileTimePoly {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));        // Calls add(int, int)
        System.out.println(calc.add(10.5, 20.5));    // Calls add(double, double)
        System.out.println(calc.add(10, 20, 30));    // Calls add(int, int, int)
    }
}

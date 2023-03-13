package patterns.structural_patterns.dao;

public class Main {
    public static void main(String[] args) {

        Calc calc = new Calc();
        System.out.println(calc.add(5, 6));
        System.out.println(calc.sum(7, 6));
        System.out.println(calc.div(10, 0));

        System.out.println(Calculation.mul(4, 5));

        double i = calc.i;

        // calc.i =6;
    }
}

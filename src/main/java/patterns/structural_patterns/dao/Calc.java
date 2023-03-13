package patterns.structural_patterns.dao;

public class Calc implements Calculation{

    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double sum(double x, double y) {
        return x - y;
    }
}

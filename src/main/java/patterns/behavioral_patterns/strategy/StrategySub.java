package patterns.behavioral_patterns.strategy;

public class StrategySub implements Strategy{
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}

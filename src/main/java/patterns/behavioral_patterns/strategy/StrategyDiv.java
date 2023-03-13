package patterns.behavioral_patterns.strategy;

public class StrategyDiv implements Strategy{
    @Override
    public double execute(double a, double b) {
        return (b!=0) ? a/b : 0;
    }
}

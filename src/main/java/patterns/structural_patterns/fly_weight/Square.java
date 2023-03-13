package patterns.structural_patterns.fly_weight;

public class Square implements Share{
    double a = 5;
    @Override
    public void draw(double x, double y) {
        System.out.println("Square"+ x + ", " + y+ ", "+ a);
    }
}

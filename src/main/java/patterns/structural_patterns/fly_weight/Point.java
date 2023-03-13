package patterns.structural_patterns.fly_weight;

public class Point implements Share{
    @Override
    public void draw(double x, double y) {
        System.out.println("Point" + x + ", " + y);
    }
}

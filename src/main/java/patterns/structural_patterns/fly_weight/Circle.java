package patterns.structural_patterns.fly_weight;

public class Circle implements Share{

    double r = 10;
    @Override
    public void draw(double x, double y) {
        System.out.println("Circle" + x+", " + y + ", " + r);
    }
}

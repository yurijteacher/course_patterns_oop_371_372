package patterns.creational_pastterns.factory;

public class Circle implements Share {

    int r = 25;


    @Override
    public void draw(int x, int y) {
        System.out.println("Circle, x:" + x + ", y:" + y + ", r" + r);
    }
}

package patterns.creational_pastterns.factory;

public class Main {
    public static void main(String[] args) {

        ShareFactory factory = new ShareFactory();
        Share share1 = factory.getShare("коло");
        Share share2 = factory.getShare("квадрат");
        Share share3 = factory.getShare("точка");

        share1.draw(1,6);
        share2.draw(2,5);
        share3.draw(4,5);
    }
}

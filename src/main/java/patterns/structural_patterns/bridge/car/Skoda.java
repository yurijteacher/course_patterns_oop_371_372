package patterns.structural_patterns.bridge.car;


public class Skoda implements Maker{

    @Override
    public void setMaker() {
        System.out.println("Skoda - Car");
    }
}

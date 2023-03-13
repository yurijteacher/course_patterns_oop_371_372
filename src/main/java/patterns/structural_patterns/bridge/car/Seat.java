package patterns.structural_patterns.bridge.car;

public class Seat implements Maker{
    @Override
    public void setMaker() {
        System.out.println("Seat - car");
    }
}

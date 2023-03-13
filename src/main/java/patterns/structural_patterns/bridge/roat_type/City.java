package patterns.structural_patterns.bridge.roat_type;

import patterns.structural_patterns.bridge.car.Maker;

public class City extends Car {

    public City(Maker maker) {
        super(maker);
    }

    @Override
    public void showInfo() {
        maker.setMaker();
        System.out.println("This is car for city");
    }


}

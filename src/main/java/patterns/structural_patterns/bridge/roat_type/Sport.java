package patterns.structural_patterns.bridge.roat_type;

import patterns.structural_patterns.bridge.car.Maker;

public class Sport extends Car{

    public Sport(Maker maker) {
        super(maker);
    }

    @Override
    public void showInfo() {
        maker.setMaker();
        System.out.println("This is a car for sport");
    }
}

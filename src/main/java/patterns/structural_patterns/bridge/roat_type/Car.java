package patterns.structural_patterns.bridge.roat_type;

import patterns.structural_patterns.bridge.car.Maker;

public abstract class Car {

   Maker maker;

    public Car(Maker maker) {
        this.maker = maker;
    }
    public abstract void showInfo();

}

package patterns.structural_patterns.bridge;

import patterns.structural_patterns.bridge.car.Skoda;
import patterns.structural_patterns.bridge.roat_type.Car;
import patterns.structural_patterns.bridge.roat_type.City;
import patterns.structural_patterns.bridge.roat_type.Sport;

public class Main {

    public static void main(String[] args) {

        Car skoda2000 = new City(new Skoda());
        Car skodaRS = new Sport(new Skoda());

        skodaRS.showInfo();
        skoda2000.showInfo();
    }

}

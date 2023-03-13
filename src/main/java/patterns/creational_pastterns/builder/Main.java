package patterns.creational_pastterns.builder;

public class Main {

    public static void main(String[] args) {

        BuilderCar builderCar = new BuilderCar();
        builderCar.builderEngine(Engine.s4000);
        builderCar.builderManufacture(Manufacture.seat);
        Car car = builderCar.builder();

        System.out.println(car);


        Car car1 = new BuilderCar()
                .builderName("Seat 2000")
                .builderEngine(Engine.s2500)
                .builderRoadType(RoadType.sport)
                .builderTransmission(Transmission.auto)
                .builder();

        System.out.println(car1);

    }
}

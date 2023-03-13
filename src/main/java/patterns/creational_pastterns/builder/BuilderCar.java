package patterns.creational_pastterns.builder;

public class BuilderCar {

    private String name = "def";
    private Engine engine = Engine.s2500;
    private Manufacture manufacture = Manufacture.bmw;
    private Transmission transmission = Transmission.manual;
    private SizeCar sizeCar = SizeCar.l2700;
    private RoadType roadType = RoadType.city;

    BuilderCar builderName(String name){
        this.name = name;
        return this;
    }
    BuilderCar builderEngine(Engine e){
        this.engine = e;
        return this;
    }


    BuilderCar builderManufacture(Manufacture t){
        this.manufacture = t;
        return this;
    }
    BuilderCar builderTransmission(Transmission t){
        this.transmission = t;
        return this;
    }

    BuilderCar builderSize(SizeCar s){
        this.sizeCar = s;
        return this;
    }


    BuilderCar builderRoadType(RoadType r){
        this.roadType = r;
        return this;
    }

    public Car builder(){
        Car car = new Car();
        car.setName(name);
        car.setEngine(engine);
        car.setManufacture(manufacture);
        car.setTransmission(transmission);
        car.setRoadType(roadType);
        car.setSizeCar(sizeCar);

        return car;
    }

}

package patterns.creational_pastterns.builder;

public class Car {

    private String name;
    private Engine engine;
    private Manufacture manufacture;
    private Transmission transmission;
    private SizeCar sizeCar;
    private RoadType roadType;

    public Car() {
    }

    public Car(String name, Engine engine, Manufacture manufacture, Transmission transmission, SizeCar sizeCar, RoadType roadType) {
        this.name = name;
        this.engine = engine;
        this.manufacture = manufacture;
        this.transmission = transmission;
        this.sizeCar = sizeCar;
        this.roadType = roadType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public SizeCar getSizeCar() {
        return sizeCar;
    }

    public void setSizeCar(SizeCar sizeCar) {
        this.sizeCar = sizeCar;
    }

    public RoadType getRoadType() {
        return roadType;
    }

    public void setRoadType(RoadType roadType) {
        this.roadType = roadType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", manufacture=" + manufacture +
                ", transmission=" + transmission +
                ", sizeCar=" + sizeCar +
                ", roadType=" + roadType +
                '}';
    }
}

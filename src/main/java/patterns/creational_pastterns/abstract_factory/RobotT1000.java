package patterns.creational_pastterns.abstract_factory;

public class RobotT1000 extends Robot{

    private String model;

    public RobotT1000() {
    }

    public RobotT1000(String model) {
        this.model = model;
    }

    public RobotT1000(Head head, Leg leg, Hand hand, String model) {
        super(head, leg, hand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "RobotT1000{" +
                 super.toString() +", " +
                 "model='" + model + '\'' +
                '}';
    }
}

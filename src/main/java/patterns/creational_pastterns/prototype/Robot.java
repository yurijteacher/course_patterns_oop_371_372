package patterns.creational_pastterns.prototype;

public class Robot implements Cloneable {

    private String name;
    private String model;
    private String color;

    public Robot() {
    }

    public Robot(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Object clone(String name, String model, String color) {
        return new Robot(name, model, color);
    }
}

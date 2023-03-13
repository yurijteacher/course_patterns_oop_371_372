package patterns.structural_patterns.decorator;

public class BorderDecorator extends Decorator{

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    void afterComponent() {
        System.out.println(" +  border");
    }
}

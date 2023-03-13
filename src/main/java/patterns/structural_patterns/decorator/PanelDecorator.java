package patterns.structural_patterns.decorator;

public class PanelDecorator extends Decorator{

    public PanelDecorator(Component component) {
        super(component);
    }

    @Override
    void afterComponent() {
        System.out.println(" + panel");
    }
}

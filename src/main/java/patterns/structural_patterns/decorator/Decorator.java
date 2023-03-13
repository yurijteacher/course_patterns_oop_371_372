package patterns.structural_patterns.decorator;

public abstract class Decorator implements Component {


    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
        afterComponent();
    }


    abstract void afterComponent();
} 
